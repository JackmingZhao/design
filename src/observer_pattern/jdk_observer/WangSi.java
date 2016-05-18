package observer_pattern.jdk_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * ����Ĺ۲���
 * @author lenovo
 *
 */
public class WangSi implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("��˹���۲쵽�����ӻ���Լ�Ҳ��ʼ���...");
		this.cry(arg.toString());
		System.out.println("��˹��������...\n");
	}

	// һ���������л������ʹ��
	private void cry(String context) {
		System.out.println("��˹����Ϊ" + context + "��--�����ұ���ѽ��");
	}
}
