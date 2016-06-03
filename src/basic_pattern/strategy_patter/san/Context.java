package basic_pattern.strategy_patter.san;

public class Context {
	private Calculator cal=null;
	public Context(Calculator _cal) {
		this.cal=_cal;
	}
	public int execute(int a, int b) {
		return this.cal.execute(a, b);
	}

}
