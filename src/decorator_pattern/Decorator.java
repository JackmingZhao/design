package decorator_pattern;

public abstract class Decorator extends SchoolReport {
	
	private SchoolReport report;
	
	public Decorator(SchoolReport _report) {
		this.report=_report;
	}

	@Override
	public void report() {
		System.out.println("decorator¿‡");
		this.report.report();
	}

	@Override
	public void sign(String name) {
		this.report.sign(name);
	}

}
