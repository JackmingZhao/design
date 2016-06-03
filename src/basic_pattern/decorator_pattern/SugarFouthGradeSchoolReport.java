package basic_pattern.decorator_pattern;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
	//报告全班最高成绩
	private void reportHighScore() {
		System.out.println("这次考试语文最高是75，数学是78，自然是80");
	}
	//报告排名
	private void reportSort() {
		System.out.println("我是排名第38名...");
	}
	
	@Override
	public void report() {
		this.reportHighScore();
		super.report();
		this.reportSort();
	}
	
}
