package decorator_pattern;

/**
 * װ��ģʽ
 * @author lenovo
 *
 */
public class Father {

	public static void main(String[] args) {
		SchoolReport report = new FouthGradeSchoolReport();
		report = new HighScoreDecorator(report);
		report = new SortDecorator(report);
		report.report();
		report.sign("OldHerman");
	}

}
