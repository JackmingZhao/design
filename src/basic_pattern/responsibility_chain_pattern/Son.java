package basic_pattern.responsibility_chain_pattern;

public class Son extends IHandler {
	
	public Son() {
		super(IHandler.SON_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("--------ĸ���������ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("���ӵĴ��ǣ�ͬ��\n");
	}

}
