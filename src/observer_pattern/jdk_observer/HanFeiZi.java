package observer_pattern.jdk_observer;

import java.util.Observable;

public class HanFeiZi extends Observable implements IHanFeiZi {

	@Override
	public void haveBreakfast() {
		System.out.println("韩非子:开始吃饭了...");
		//通知所有观察者
		super.setChanged();
		super.notifyObservers("韩非子在吃饭");
	}

	@Override
	public void haveFun() {
		System.out.println("韩非子:开始娱乐了...");
		//通知所有观察者
		super.setChanged();
		super.notifyObservers("韩非子在娱乐");
	}

}
