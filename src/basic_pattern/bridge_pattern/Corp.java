package basic_pattern.bridge_pattern;

/**
 * ����˾�࣬���͵�ģ��ģʽ
 * @author lenovo
 *
 */
public abstract class Corp {
	private Product product;
	public Corp(Product _product) {
		this.product = _product;
	}

	// ��˾�Ǹ�ʲô�ģ�׬Ǯ��
	public void makeMoney() {
		// ÿ����˾����һ����������
		this.product.beProducted();
		// Ȼ������
		this.product.beSelled();
	}
}
