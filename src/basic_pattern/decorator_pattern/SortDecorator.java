package basic_pattern.decorator_pattern;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport report) {
		super(report);
	}
	
	private void reportSort() {
		System.out.println("我是排名第38名...");
	}
	
	@Override
	public void report() {
		System.out.println("sort 类");
		super.report();
		this.reportSort();
	}
	
}
