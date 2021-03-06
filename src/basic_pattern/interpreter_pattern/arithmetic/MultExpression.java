package basic_pattern.interpreter_pattern.arithmetic;

import java.util.HashMap;

public class MultExpression extends SymbolExpression {

	public MultExpression(Expression _left, Expression _right) {
		super(_left, _right);
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var)*super.right.interpreter(var);
	}

}
