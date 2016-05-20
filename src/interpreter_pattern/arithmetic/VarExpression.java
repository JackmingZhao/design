package interpreter_pattern.arithmetic;

import java.util.HashMap;

/**
 * ����Ԫ�صı��ʽ���������㹫ʽ��Ԫ�ص���ֵ
 * @author lenovo
 *
 */
public class VarExpression extends Expression {
	private String key;
	//ͨ�����캯�����ݽ�����ʽ�еĲ���
	public VarExpression(String _key) {
		this.key=_key;
	}

	//�Դ������Ĳ���map���н�����ƥ��
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}

}
