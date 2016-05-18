package mediator_pattern;

/*
 * ������н�ʵ����
 */
public class Mediator extends AbstractMediator {

	/*
	 * �����ִ�з��������������ҵ����ж�
	 */
	public void execute(String str, Object... objects) {
		if (str.equals("purchase.buy")) {// �ɹ�
			this.buyComputer((Integer)objects[0]);
		} else if (str.equals("sale.sell")) {// ��
			this.sellComputer((Integer)objects[0]);
		} else if (str.equals("sale.offsell")) {// ������
			this.offSell();
		} else if (str.equals("stock.clear")) {// ����
			this.clearStock();
		}
	}

	// �ɹ�����
	private void buyComputer(int number) {
		int saleStatus = super.sale.getSaleStatus();
		if (saleStatus > 80) { // �����������
			System.out.println("�ɹ�IBM����:" + number + "̨");
			super.stock.increaseStock(number);
		} else { // �����������
			int buyNumber = number / 2; // �۰�ɹ�
			System.out.println("�ɹ�IBM���ԣ�" + buyNumber + "̨");
			super.stock.increaseStock(buyNumber);
		}
	}

	// ���۵���
	private void sellComputer(int number) {
		if (super.stock.getStockNumber() < number) { // ���������������
			super.purchase.buyIBMcomputer(number);
		}
		super.stock.decreaseStock(number);
	}

	// �ۼ����۵���
	private void offSell() {
		System.out.println("�ۼ�����IBM����" + stock.getStockNumber() + "̨");
	}

	// ��ִ���
	private void clearStock() {
		// Ҫ���������
		super.sale.offsell();
		// Ҫ��ɹ���Ա��Ҫ�ɹ�
		super.purchase.refuseBuy();
	}

}
