package basic_pattern.responsibility_chain_pattern;

public class Son extends IHandler {
	
	public Son() {
		super(IHandler.SON_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("--------母亲向儿子请示-------");
		System.out.println(women.getRequest());
		System.out.println("儿子的答复是：同意\n");
	}

}
