package basic_pattern.interpreter_pattern.arithmetic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Calculator {
	// 定义一个表达式
	private Expression expression;

	// 构造函数传递进来需要解析的表达式
	public Calculator(String expStr) {
		// 使用栈，安排运算的前后顺序
		Stack<Expression> stack = new Stack<Expression>();
		// 将表但是拆分为字节数组，进行解析
		char[] charArray = expStr.toCharArray();

		if (expStr.indexOf('*') != -1 || expStr.indexOf('/') != -1) {
			// System.out.println(String.valueOf(multAndDivi(charArray)));
			addAndSub(stack, multAndDivi(charArray));
		} else {
			addAndSub(stack, charArray);
		}
	}

	private Object[] multAndDivi(char[] charArray) {
		Object[] arr = new Object[10];
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '*':
				arr[i - 1] = new MultExpression(new VarExpression(
						String.valueOf(charArray[i - 1])), new VarExpression(
						String.valueOf(charArray[i + 1])));
				i += 1;
				break;
			case '/':
				arr[i - 1] = new DiviExpression(new VarExpression(
						String.valueOf(charArray[i - 1])), new VarExpression(
						String.valueOf(charArray[i + 1])));
				i += 1;
				break;
			default:
				arr[i] = charArray[i];
			}
		}
		return change(arr);
	}

	private void addAndSub(Stack<Expression> stack, char[] charArray) {
		Expression left = null;
		Expression right = null;
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+':// 加法
				left = stack.pop();// 现在栈顶存的是数字表达式，直接pop用于加法的左表达式
				right = new VarExpression(String.valueOf(charArray[++i]));// 右表达式是这个+符号后边的那一位字符，所以使用++i
				stack.push(new AddExpression(left, right));// 将运算后的结果再次压入栈顶
				break;// 做完运算就要挑出循环
			case '-':// 减法
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default:// 公式中的变量元素表达式，其实就是通过VarExpression运算元素表达式获取具体的数值
				stack.push(new VarExpression(String.valueOf(charArray[i])));// 将读取到的运算数值压入到栈顶
			}
		}
		this.expression = stack.pop();
	}

	private void addAndSub(Stack<Expression> stack, Object[] charArray) {
		// 运算，定义出左表达式和右表达式
		Expression left = null;
		Expression right = null;
		for (int i = 0; i < charArray.length; i++) {
			Object mark = charArray[i];
			if(mark instanceof Expression) {
				stack.push((Expression) mark);
				continue;
			}
			if ((Character) mark == '+') {
				left = stack.pop();// 现在栈顶存的是数字表达式，直接pop用于加法的左表达式
				if (mark instanceof Expression) {
					right = (Expression) mark;
				} else {
					if(charArray[++i] instanceof Expression)
						right = (Expression) charArray[i];
					else
						right = new VarExpression(String.valueOf(charArray[i]));// 右表达式是这个+符号后边的那一位字符，所以使用++i
				}
				stack.push(new AddExpression(left, right));// 将运算后的结果再次压入栈顶
			} else if ((Character) mark == '-') {
				left = stack.pop();
				if (mark instanceof Expression) {
					right = (Expression) mark;
				} else {
					right = new VarExpression(String.valueOf(charArray[++i]));
				}
				stack.push(new SubExpression(left, right));
			} else {
				if (mark instanceof Expression) {
					stack.push((Expression) mark);
				}
				stack.push(new VarExpression(String.valueOf(charArray[i])));
			}
		}
		this.expression = stack.pop();
	}

	// 开始运算
	public int run(HashMap<String, Integer> var) {
		return this.expression.interpreter(var);
	}

	//数组去空
	private Object[] change(Object[] strings) {
		List<Object> list = new ArrayList<Object>();
		for (int i = 0; i < strings.length; i++) {
			if (!"".equals(strings[i]) && null != strings[i]) {
				list.add(strings[i]);
			}
		}
		return list.toArray();
	}

}
