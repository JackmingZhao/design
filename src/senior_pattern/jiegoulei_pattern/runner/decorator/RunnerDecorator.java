package senior_pattern.jiegoulei_pattern.runner.decorator;

public class RunnerDecorator implements IRunner {
	private IRunner runner;
	public RunnerDecorator(IRunner _runner) {
		this.runner = _runner;
	}

	@Override
	public void run() {
		System.out.println("�ӿ��˶�Ա���ٶȣ�Ϊ�˶�Ա��������װ��");
		this.runner.run();
	}

}
