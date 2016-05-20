package interpreter_pattern.arithmetic;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
	//定义一个表达式
	private Expression expression;
	//构造函数传递进来需要解析的表达式
	public Calculator(String expStr) {
		//使用栈，安排运算的前后顺序
		Stack<Expression> stack = new Stack<Expression>();
		//将表但是拆分为字节数组，进行解析
		char[] charArray = expStr.toCharArray();
		//运算，定义出左表达式和右表达式
		Expression left = null;
		Expression right = null;
		for(int i=0;i<charArray.length;i++) {
			switch(charArray[i]) {
			case '+'://加法
				left = stack.pop();//现在栈顶存的是数字表达式，直接pop用于加法的左表达式
				right = new VarExpression(String.valueOf(charArray[++i]));//右表达式是这个+符号后边的那一位字符，所以使用++i
				stack.push(new AddExpression(left, right));//将运算后的结果再次压入栈顶
				break;//做完运算就要挑出循环
			case '-'://减法
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default ://公式中的变量元素表达式，其实就是通过VarExpression运算元素表达式获取具体的数值
				stack.push(new VarExpression(String.valueOf(charArray[i])));//将读取到的运算数值压入到栈顶
			}
		}
		this.expression=stack.pop();
	}
	
	//开始运算
	public int run(HashMap<String,Integer> var) {
		return this.expression.interpreter(var);
	}

}
