package interpreter_pattern.arithmetic;

import java.util.HashMap;

public class DiviExpression extends SymbolExpression {

	public DiviExpression(Expression _left, Expression _right) {
		super(_left, _right);
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var)/super.right.interpreter(var);
	}

}
