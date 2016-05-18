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

	// �����Աֵ����
	private Calculator(String _value) {
		this.value = _value;
	}

	// ���ö�ٳ�Ա��ֵ
	public String getValue() {
		return this.value;
	}

	// ����һ��������
	public abstract int execute(int a, int b);

}
