package basic_pattern.bridge_pattern;

public class Mp4 extends Product {

	@Override
	public void beProducted() {
		System.out.println("生产出的MP4是这样的...");
	}

	@Override
	public void beSelled() {
		System.out.println("生产出的MP4卖出去了...");
	}

}
