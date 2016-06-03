package basic_pattern.responsibility_chain_pattern;

public class Women implements IWomen {
	private int type = 0;
	// 古代女人的请示
	private String request = "";

	// 构造函数传递过来请求
	public Women(int _type, String _request) {
		this.type = _type;
		// 为了便于显示，在这里做了点处理
		switch (this.type) {
		case 1:
			this.request = "女儿的请求是：" + _request;
			break;
		case 2:
			this.request = "妻子的请求是：" + _request;
			break;
		case 3:
			this.request = "母亲的请求是：" + _request;
		}
	}

	// 获得自己的状况
	public int getType() {
		return this.type;
	}

	// 获得古代女人的请求
	public String getRequest() {
		return this.request;
	}

}
