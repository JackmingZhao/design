package basic_pattern.decorator_pattern;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport report) {
		super(report);
	}
	
	private void reportSort() {
		System.out.println("����������38��...");
	}
	
	@Override
	public void report() {
		System.out.println("sort ��");
		super.report();
		this.reportSort();
	}
	
}
