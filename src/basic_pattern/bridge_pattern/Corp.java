package basic_pattern.bridge_pattern;

/**
 * 抽象公司类，典型的模板模式
 * @author lenovo
 *
 */
public abstract class Corp {
	private Product product;
	public Corp(Product _product) {
		this.product = _product;
	}

	// 公司是干什么的？赚钱的
	public void makeMoney() {
		// 每个公司都是一样，先生产
		this.product.beProducted();
		// 然后销售
		this.product.beSelled();
	}
}
