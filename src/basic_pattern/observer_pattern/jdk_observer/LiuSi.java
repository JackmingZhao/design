package basic_pattern.observer_pattern.jdk_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体的观察者
 * @author lenovo
 *
 */
public class LiuSi implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("刘斯：观察到韩非子活动，开始动作了...");
		this.happy(arg.toString());
		System.out.println("刘斯：乐死了\n");
	}

	// 一看韩非子有变化，他就快乐
	private void happy(String context) {
		System.out.println("刘斯：因为" + context + ",--所以我快乐呀！");
	}

}
