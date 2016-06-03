package basic_pattern.observer_pattern.normal_observer;

/**
 * 具体的观察者
 * @author lenovo
 *
 */
public class WangSi implements Observer {

	@Override
	public void update(String context) {
		System.out.println("王斯：观察到韩非子活动，自己也开始活动了...");
		this.cry(context);
		System.out.println("王斯：哭死了...\n");
	}

	// 一看韩非子有活动，他就痛哭
	private void cry(String context) {
		System.out.println("王斯：因为" + context + "，--所以我悲伤呀！");
	}
}
