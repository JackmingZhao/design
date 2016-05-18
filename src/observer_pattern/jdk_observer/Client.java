package observer_pattern.jdk_observer;

import java.util.Observable;
import java.util.Observer;

public class Client {
	
	public static void main(String[] args) {
		//三个观察者
		Observer lisi = new LiSi();
		Observer liusi = new LiuSi();
		Observer wangsi = new WangSi();
		//定义被观察者
		IHanFeiZi han = new HanFeiZi();
		((Observable)han).addObserver(wangsi);
		((Observable)han).addObserver(liusi);
		((Observable)han).addObserver(lisi);
		// 然后这里我们看看韩非子在干什么
		han.haveBreakfast();
	}

}
