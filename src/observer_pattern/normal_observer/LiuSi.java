package observer_pattern.normal_observer;

/**
 * ����Ĺ۲���
 * @author lenovo
 *
 */
public class LiuSi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("��˹���۲쵽�����ӻ����ʼ������...");
		this.happy(context);
		System.out.println("��˹��������\n");
	}

	// һ���������б仯�����Ϳ���
	private void happy(String context) {
		System.out.println("��˹����Ϊ" + context + ",--�����ҿ���ѽ��");
	}

}
