package decorator_pattern;

public class HighScoreDecorator extends Decorator {
	
	public HighScoreDecorator(SchoolReport report) {
		super(report);
	}
	
	private void reportHighScore() {
		System.out.println("这次考试语文最高是75，数学是78，自然是80");
	}
	
	@Override
	public void report() {
		System.out.println("high类");
		this.reportHighScore();
		super.report();
	}

}
