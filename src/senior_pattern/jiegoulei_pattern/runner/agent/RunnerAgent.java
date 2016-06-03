package senior_pattern.jiegoulei_pattern.runner.agent;

import java.util.Random;

/**
 * ������
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
			System.out.println("������ͬ�ⰲ���˶�Ա�ܲ�");
			runner.run();
		} else {
			System.out.println("���������鲻�ã��������˶�Ա�ܲ�");
		}
	}

}
