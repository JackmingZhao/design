package basic_pattern.observer_pattern.normal_observer;

/**
 * ����Ĺ۲���
 * @author lenovo
 *
 */
public class WangSi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("��˹���۲쵽�����ӻ���Լ�Ҳ��ʼ���...");
		this.cry(context);
		System.out.println("��˹��������...\n");
	}

	// һ���������л������ʹ��
	private void cry(String context) {
		System.out.println("��˹����Ϊ" + context + "��--�����ұ���ѽ��");
	}
}
