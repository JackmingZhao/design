package responsibility_chain_pattern;

public class Father extends IHandler {

	//需要有构造方法，父类框定子类必须有一个显示的构造方法，要不然子类编译不通过
	public Father() {
		super(IHandler.FATHER_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("--------女儿向父亲请示-------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是:同意\n");
	}

}
