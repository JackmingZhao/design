package decorator_pattern;

public class HighScoreDecorator extends Decorator {
	
	public HighScoreDecorator(SchoolReport report) {
		super(report);
	}
	
	private void reportHighScore() {
		System.out.println("��ο������������75����ѧ��78����Ȼ��80");
	}
	
	@Override
	public void report() {
		System.out.println("high��");
		this.reportHighScore();
		super.report();
	}

}
