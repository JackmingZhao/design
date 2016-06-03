package basic_pattern.bridge_pattern;

public class ShanzaiCorp extends Corp {
	public ShanzaiCorp(Product product) {
		super(product);
	}

	// ¿ñ×¬Ç®
	public void makeMoney() {
		super.makeMoney();
		System.out.println("ÎÒ×¬Ç®Ñ½...");
	}
}
