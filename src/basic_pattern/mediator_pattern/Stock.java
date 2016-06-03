package basic_pattern.mediator_pattern;

public class Stock extends AbstractColleague {
	public Stock(AbstractMediator _mediator) {
		super(_mediator);
	}
	
	private static int COMPUTER_NUMBER = 100;
	
	//���ӿ��
	public void increaseStock(int number) {
		COMPUTER_NUMBER=COMPUTER_NUMBER+number;
		System.out.println("�������Ϊ:"+COMPUTER_NUMBER);
	}
	
	//���ٿ��
	public void decreaseStock(int number) {
		COMPUTER_NUMBER=COMPUTER_NUMBER-number;
		System.out.println("�������Ϊ:"+COMPUTER_NUMBER);
	}
	
	//���
	public void clearStock() {
		super.mediator.execute("stock.clear");
	}
	
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}

}
