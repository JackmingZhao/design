package senior_pattern.jiegoulei_pattern.runner.decorator;

public class RunnerDecorator implements IRunner {
	private IRunner runner;
	public RunnerDecorator(IRunner _runner) {
		this.runner = _runner;
	}

	@Override
	public void run() {
		System.out.println("加快运动员的速度：为运动员增加喷气装置");
		this.runner.run();
	}

}
