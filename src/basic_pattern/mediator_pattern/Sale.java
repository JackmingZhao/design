package basic_pattern.mediator_pattern;

import java.util.Random;

public class Sale extends AbstractColleague {
	public Sale(AbstractMediator _mediator) {
		super(_mediator);
	}
	
	//卖
	public void sell(int number) {
		super.mediator.execute("sale.sell", number);
	}
	
	//反馈销售情况
	public int getSaleStatus() {
		Random rand = new Random(System.currentTimeMillis());
		int saleStatus = rand.nextInt(100);
		System.out.println("IBM电脑的销售情况为："+saleStatus);
		return saleStatus;
	}
	
	//打折卖
	public void offsell() {
		super.mediator.execute("sale.offsell");
	}

}
