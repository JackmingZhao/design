package senior_pattern.jiegoulei_pattern.runner.decorator;

public class Client {

	public static void main(String[] args) {
		//定义一个运动员
		IRunner runner = new Runner();
		//使用装饰器增强功能
		IRunner decorator = new RunnerDecorator(runner);
		//看看它的跑步情况如何
		System.out.println("===增强后的运动员的功能===");
		decorator.run();
	}

}
