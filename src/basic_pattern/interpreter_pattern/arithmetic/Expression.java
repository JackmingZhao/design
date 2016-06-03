package basic_pattern.interpreter_pattern.arithmetic;

import java.util.HashMap;

/**
 * 元素的解析器，不管是运算元素还是运算符号，都需要被解析
 * @author lenovo
 *
 */
public abstract class Expression {
	//解析公式或则数值，其中var里的key是公式中的参数，value是具体数字
	public abstract int interpreter(HashMap<String, Integer> var);

}
