package basic_pattern.bridge_pattern;

public class Mp4 extends Product {

	@Override
	public void beProducted() {
		System.out.println("��������MP4��������...");
	}

	@Override
	public void beSelled() {
		System.out.println("��������MP4����ȥ��...");
	}

}
