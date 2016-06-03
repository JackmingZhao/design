package basic_pattern.strategy_patter.san;

public class Add implements Calculator {

	@Override
	public int execute(int a, int b) {
		return a+b;
	}

}
