package decorator_pattern;

public abstract class SchoolReport {

	//成绩单的成绩情况
	public abstract void report();
	//家长要在成绩单上签字
	public abstract void sign(String name);
	
}
