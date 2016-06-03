package basic_pattern.mediator_pattern;

public class Purchase extends AbstractColleague {
	
	public Purchase(AbstractMediator _mediator) {
		super(_mediator);
	}
	
	//�ɹ�IBM����
	public void buyIBMcomputer(int number) {
		super.mediator.execute("purchase.buy", number);
	}
	
	//ֹͣ�ɹ�
	public void refuseBuy() {
		System.out.println("���ٲɹ�IBM����");
	}

}
