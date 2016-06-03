package basic_pattern.strategy_patter.san;

public class Sub implements Calculator {

	@Override
	public int execute(int a, int b) {
		return a-b;
	}

}
