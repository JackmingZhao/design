package strategy_patter.si;

public enum Calculator {

	ADD("+") {
		public int execute(int a, int b) {
			return a + b;
		}
	},
	SUB("-") {
		public int execute(int a, int b) {
			return a - b;
		}
	};

	String value = "";

	// 定义成员值类型
	private Calculator(String _value) {
		this.value = _value;
	}

	// 获得枚举成员的值
	public String getValue() {
		return this.value;
	}

	// 声明一个抽象函数
	public abstract int execute(int a, int b);

}
