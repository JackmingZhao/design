package basic_pattern.mediator_pattern;

/*
 * ������н���ͨ�����캯����������ʽ��ҵ��������󴫵ݽ���
 * ���ƶ�һ�������ִ�з�������������ȥ���ִ�е�ҵ���߼�
 */
public abstract class AbstractMediator {

	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;

	// ���캯��
	public AbstractMediator() {
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}

	// �н�������Ҫ�ķ��������¼�����������������֮��Ĺ�ϵ
	public abstract void execute(String str, Object... objects);

}
