package basic_pattern.interpreter_pattern.arithmetic;

import java.util.HashMap;

/**
 * Ԫ�صĽ�����������������Ԫ�ػ���������ţ�����Ҫ������
 * @author lenovo
 *
 */
public abstract class Expression {
	//������ʽ������ֵ������var���key�ǹ�ʽ�еĲ�����value�Ǿ�������
	public abstract int interpreter(HashMap<String, Integer> var);

}
