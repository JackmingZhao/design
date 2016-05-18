package observer_pattern.normal_observer;

import java.util.ArrayList;

public class HanFeiZi implements IHanFeiZi, Observable {
	//观察者
	private ArrayList<Observer> observerList = new ArrayList<Observer>();

	@Override
	public void haveBreakfast() {
		System.out.println("韩非子:开始吃饭了...");
		//通知李斯，调用观察者的方法
		this.notifyObserver("韩非子在吃饭");
	}

	@Override
	public void haveFun() {
		System.out.println("韩非子:开始娱乐了...");
		this.notifyObserver("韩非子在娱乐");
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
