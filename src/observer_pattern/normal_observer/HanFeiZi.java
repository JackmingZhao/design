package observer_pattern.normal_observer;

import java.util.ArrayList;

public class HanFeiZi implements IHanFeiZi, Observable {
	//�۲���
	private ArrayList<Observer> observerList = new ArrayList<Observer>();

	@Override
	public void haveBreakfast() {
		System.out.println("������:��ʼ�Է���...");
		//֪ͨ��˹�����ù۲��ߵķ���
		this.notifyObserver("�������ڳԷ�");
	}

	@Override
	public void haveFun() {
		System.out.println("������:��ʼ������...");
		this.notifyObserver("������������");
	}

	@Override
	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notifyObserver(String context) {
		for(Observer o : this.observerList) {
			o.update(context);
		}			
	}

}
