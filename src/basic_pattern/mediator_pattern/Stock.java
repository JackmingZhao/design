package basic_pattern.mediator_pattern;

public class Stock extends AbstractColleague {
	public Stock(AbstractMediator _mediator) {
		super(_mediator);
	}
	
	private static int COMPUTER_NUMBER = 100;
	
	//增加库存
	public void increaseStock(int number) {
		COMPUTER_NUMBER=COMPUTER_NUMBER+number;
		System.out.println("库存数量为:"+COMPUTER_NUMBER);
	}
	
	//减少库存
	public void decreaseStock(int number) {
		COMPUTER_NUMBER=COMPUTER_NUMBER-number;
		System.out.println("库存数量为:"+COMPUTER_NUMBER);
	}
	
	//清仓
	public void clearStock() {
		super.mediator.execute("stock.clear");
	}
	
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}

}
