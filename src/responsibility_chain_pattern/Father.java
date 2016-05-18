package responsibility_chain_pattern;

public class Father extends IHandler {

	//��Ҫ�й��췽������������������һ����ʾ�Ĺ��췽����Ҫ��Ȼ������벻ͨ��
	public Father() {
		super(IHandler.FATHER_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("--------Ů��������ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("���׵Ĵ���:ͬ��\n");
	}

}
