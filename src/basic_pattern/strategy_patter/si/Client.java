package basic_pattern.strategy_patter.si;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		// �������������������
		int a = Integer.parseInt(args[0]);
		String symbol = args[1]; // ����
		int b = Integer.parseInt(args[2]);
		System.out.println("����Ĳ���Ϊ��" + Arrays.toString(args));
		System.out.println("���н��Ϊ��"+a+symbol+b+"="+Calculator.ADD.execute(a, b));
	}

}
