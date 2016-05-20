package interpreter_pattern.arithmetic;

import java.util.HashMap;

/**
 * 运算元素的表达式，返回运算公式中元素的数值
 * @author lenovo
 *
 */
public class VarExpression extends Expression {
	private String key;
	//通过构造函数传递进来公式中的参数
	public VarExpression(String _key) {
		this.key=_key;
	}

	//对传进来的参数map进行解析和匹配
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}

}
