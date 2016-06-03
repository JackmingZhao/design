package senior_pattern.jiegoulei_pattern.runner.agent;
/**
 * 被代理实现类
 * @author lenovo
 *
 */
public class Runner implements IRunner {

	@Override
	public void run() {
		System.out.println("运动员跑步：动作很潇洒");
	}

}
