package observer_pattern.jdk_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * ����Ĺ۲���
 * @author lenovo
 *
 */
public class LiSi implements Observer {
	// ����jdk�Ĺ۲��߷���
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("��˹:�۲쵽�����ӻ����ʼ���ϰ�㱨��...");
		this.reportToQinShiHuang(arg.toString());
		System.out.println("��˹���㱨���...\n");
	}

	// �㱨����ʼ��
	private void reportToQinShiHuang(String reportContext) {
		System.out.println("��˹�����棬���ϰ壡�������л��--->" + reportContext);
	}
}
