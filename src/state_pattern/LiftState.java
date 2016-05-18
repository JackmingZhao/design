package state_pattern;


/**
 * ����״̬�ĳ����࣬״̬�ĳ�����
 * @author lenovo
 *
 */
public abstract class LiftState {
	//����һ��������ɫ����ס״̬�仯����Ĺ��ܱ仯
	protected Context context;
	public void setContext(Context _context) {
		this.context = _context;
	}
	//���ȵ����ſ�������
	public abstract void open();
	//�������п������ǵ�ȻҲ���йر���
	public abstract void close();
	//����Ҫ�������£���������
	public abstract void run();
	//���ݻ�Ҫ��ͣ����
	public abstract void stop();
}
