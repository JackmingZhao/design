package interpreter_pattern.arithmetic;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
	//����һ�����ʽ
	private Expression expression;
	//���캯�����ݽ�����Ҫ�����ı��ʽ
	public Calculator(String expStr) {
		//ʹ��ջ�����������ǰ��˳��
		Stack<Expression> stack = new Stack<Expression>();
		//�����ǲ��Ϊ�ֽ����飬���н���
		char[] charArray = expStr.toCharArray();
		//���㣬���������ʽ���ұ��ʽ
		Expression left = null;
		Expression right = null;
		for(int i=0;i<charArray.length;i++) {
			switch(charArray[i]) {
			case '+'://�ӷ�
				left = stack.pop();//����ջ����������ֱ��ʽ��ֱ��pop���ڼӷ�������ʽ
				right = new VarExpression(String.valueOf(charArray[++i]));//�ұ��ʽ�����+���ź�ߵ���һλ�ַ�������ʹ��++i
				stack.push(new AddExpression(left, right));//�������Ľ���ٴ�ѹ��ջ��
				break;//���������Ҫ����ѭ��
			case '-'://����
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default ://��ʽ�еı���Ԫ�ر��ʽ����ʵ����ͨ��VarExpression����Ԫ�ر��ʽ��ȡ�������ֵ
				stack.push(new VarExpression(String.valueOf(charArray[i])));//����ȡ����������ֵѹ�뵽ջ��
			}
		}
		this.expression=stack.pop();
	}
	
	//��ʼ����
	public int run(HashMap<String,Integer> var) {
		return this.expression.interpreter(var);
	}

}
