package basic_pattern.bridge_pattern;

public class House extends Product {

	@Override
	public void beProducted() {
		System.out.println("�������ķ�����������...");
	}

	@Override
	public void beSelled() {
		System.out.println("�������ķ�������ȥ��...");
	}

}
