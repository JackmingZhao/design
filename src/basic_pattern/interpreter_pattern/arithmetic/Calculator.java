package basic_pattern.interpreter_pattern.arithmetic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Calculator {
	// ����һ�����ʽ
	private Expression expression;

	// ���캯�����ݽ�����Ҫ�����ı��ʽ
	public Calculator(String expStr) {
		// ʹ��ջ�����������ǰ��˳��
		Stack<Expression> stack = new Stack<Expression>();
		// �����ǲ��Ϊ�ֽ����飬���н���
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
			case '+':// �ӷ�
				left = stack.pop();// ����ջ����������ֱ��ʽ��ֱ��pop���ڼӷ�������ʽ
				right = new VarExpression(String.valueOf(charArray[++i]));// �ұ��ʽ�����+���ź�ߵ���һλ�ַ�������ʹ��++i
				stack.push(new AddExpression(left, right));// �������Ľ���ٴ�ѹ��ջ��
				break;// ���������Ҫ����ѭ��
			case '-':// ����
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default:// ��ʽ�еı���Ԫ�ر��ʽ����ʵ����ͨ��VarExpression����Ԫ�ر��ʽ��ȡ�������ֵ
				stack.push(new VarExpression(String.valueOf(charArray[i])));// ����ȡ����������ֵѹ�뵽ջ��
			}
		}
		this.expression = stack.pop();
	}

	private void addAndSub(Stack<Expression> stack, Object[] charArray) {
		// ���㣬���������ʽ���ұ��ʽ
		Expression left = null;
		Expression right = null;
		for (int i = 0; i < charArray.length; i++) {
			Object mark = charArray[i];
			if(mark instanceof Expression) {
				stack.push((Expression) mark);
				continue;
			}
			if ((Character) mark == '+') {
				left = stack.pop();// ����ջ����������ֱ��ʽ��ֱ��pop���ڼӷ�������ʽ
				if (mark instanceof Expression) {
					right = (Expression) mark;
				} else {
					if(charArray[++i] instanceof Expression)
						right = (Expression) charArray[i];
					else
						right = new VarExpression(String.valueOf(charArray[i]));// �ұ��ʽ�����+���ź�ߵ���һλ�ַ�������ʹ��++i
				}
				stack.push(new AddExpression(left, right));// �������Ľ���ٴ�ѹ��ջ��
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

	// ��ʼ����
	public int run(HashMap<String, Integer> var) {
		return this.expression.interpreter(var);
	}

	//����ȥ��
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
