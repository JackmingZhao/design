package basic_pattern.observer_pattern.jdk_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * ����Ĺ۲���
 * @author lenovo
 *
 */
public class LiuSi implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("��˹���۲쵽�����ӻ����ʼ������...");
		this.happy(arg.toString());
		System.out.println("��˹��������\n");
	}

	// һ���������б仯�����Ϳ���
	private void happy(String context) {
		System.out.println("��˹����Ϊ" + context + ",--�����ҿ���ѽ��");
	}

}
