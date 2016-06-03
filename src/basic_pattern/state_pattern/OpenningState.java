package basic_pattern.state_pattern;

/**
 * �����״̬�仯����Ĺ��ܱ仯�������ǳ���״̬
 * 
 * ���ݳ���״̬ʱ��ֻ�ܽ��п��Ź��ܻ���Ź���
 * @author lenovo
 *
 */
public class OpenningState extends LiftState {

	@Override
	public void open() {
		//ʵ���������Ǿ����ҵ�������״̬������������������
		System.out.println("�����ſ���...");
	}

	//���ɵ�״̬
	@Override
	public void close() {
		//״̬�޸�
		super.context.setLiftState(Context.closeingState);
		//����ί��ΪCloseState��ִ��
		super.context.getLiftState().close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
