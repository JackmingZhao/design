package basic_pattern.mediator_pattern;

import java.util.Random;

public class Sale extends AbstractColleague {
	public Sale(AbstractMediator _mediator) {
		super(_mediator);
	}
	
	//��
	public void sell(int number) {
		super.mediator.execute("sale.sell", number);
	}
	
	//�����������
	public int getSaleStatus() {
		Random rand = new Random(System.currentTimeMillis());
		int saleStatus = rand.nextInt(100);
		System.out.println("IBM���Ե��������Ϊ��"+saleStatus);
		return saleStatus;
	}
	
	//������
	public void offsell() {
		super.mediator.execute("sale.offsell");
	}

}
