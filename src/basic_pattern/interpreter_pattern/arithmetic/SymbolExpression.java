package basic_pattern.interpreter_pattern.arithmetic;

/**
 * 运算符号的解析抽象类，符号分为加、减法
 * @author lenovo
 *
 */
public abstract class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	// 所有的解析公式都应只关心自己左右两个表达式的结果
	// 每个运算符号只和自己左右两个数字有关，但是左右两个“数字”有可能是通过解析出来的结果
	// 不论是具体数字还是解析结果，都是Expression抽象类
	public SymbolExpression(Expression _left, Expression _right) {
		this.left = _left;
		this.right = _right;
	}

}
