package basic_pattern.mediator_pattern;

public class Purchase extends AbstractColleague {
	
	public Purchase(AbstractMediator _mediator) {
		super(_mediator);
	}
	
	//采购IBM电脑
	public void buyIBMcomputer(int number) {
		super.mediator.execute("purchase.buy", number);
	}
	
	//停止采购
	public void refuseBuy() {
		System.out.println("不再采购IBM电脑");
	}

}
