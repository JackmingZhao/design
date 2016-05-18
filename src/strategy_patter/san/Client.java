package strategy_patter.san;

import java.util.Arrays;

public class Client {
	//�ӷ���
	public final static String ADD_SYMBOL = "+";
	//������
	public final static String SUB_SYMBOL = "-";
	public static void main(String[] args) {
		//�������������������
		int a = Integer.parseInt(args[0]);
		String symbol = args[1]; //����
		int b = Integer.parseInt(args[2]);
		System.out.println("����Ĳ���Ϊ��"+Arrays.toString(args));
		//������
		Context context = null;
		if(symbol.equals(ADD_SYMBOL)) {
			context = new Context(new Add());
		} else if(symbol.equals(SUB_SYMBOL)) {
			context = new Context(new Sub());
		}
		System.out.println("���н��Ϊ��"+a+symbol+b+"="+context.execute(a, b));
	}
}