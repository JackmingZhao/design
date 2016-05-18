package observer_pattern.jdk_observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体的观察者
 * @author lenovo
 *
 */
public class LiSi implements Observer {
	// 覆盖jdk的观察者方法
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("李斯:观察到韩非子活动，开始向老板汇报了...");
		this.reportToQinShiHuang(arg.toString());
		System.out.println("李斯：汇报完毕...\n");
	}

	// 汇报给秦始皇
	private void reportToQinShiHuang(String reportContext) {
		System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reportContext);
	}
}
