package basic_pattern.interpreter_pattern.arithmetic;

/**
 * ������ŵĽ��������࣬���ŷ�Ϊ�ӡ�����
 * @author lenovo
 *
 */
public abstract class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	// ���еĽ�����ʽ��Ӧֻ�����Լ������������ʽ�Ľ��
	// ÿ���������ֻ���Լ��������������йأ������������������֡��п�����ͨ�����������Ľ��
	// �����Ǿ������ֻ��ǽ������������Expression������
	public SymbolExpression(Expression _left, Expression _right) {
		this.left = _left;
		this.right = _right;
	}

}
