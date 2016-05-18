package observer_pattern.jdk_observer;

import java.util.Observable;

public class HanFeiZi extends Observable implements IHanFeiZi {

	@Override
	public void haveBreakfast() {
		System.out.println("������:��ʼ�Է���...");
		//֪ͨ���й۲���
		super.setChanged();
		super.notifyObservers("�������ڳԷ�");
	}

	@Override
	public void haveFun() {
		System.out.println("������:��ʼ������...");
		//֪ͨ���й۲���
		super.setChanged();
		super.notifyObservers("������������");
	}

}
