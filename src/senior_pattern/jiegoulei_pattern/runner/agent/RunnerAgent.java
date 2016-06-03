package senior_pattern.jiegoulei_pattern.runner.agent;

import java.util.Random;

/**
 * 代理类
 * @author lenovo
 *
 */
public class RunnerAgent implements IRunner {
	
	private IRunner runner;
	public RunnerAgent(IRunner _runner) {
		this.runner = _runner;
	}

	@Override
	public void run() {
		Random random = new Random();
		if(random.nextBoolean()) {
			System.out.println("代理人同意安排运动员跑步");
			runner.run();
		} else {
			System.out.println("代理人心情不好，不安排运动员跑步");
		}
	}

}
