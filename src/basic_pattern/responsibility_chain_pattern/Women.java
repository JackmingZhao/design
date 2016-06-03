package basic_pattern.responsibility_chain_pattern;

public class Women implements IWomen {
	private int type = 0;
	// �Ŵ�Ů�˵���ʾ
	private String request = "";

	// ���캯�����ݹ�������
	public Women(int _type, String _request) {
		this.type = _type;
		// Ϊ�˱�����ʾ�����������˵㴦��
		switch (this.type) {
		case 1:
			this.request = "Ů���������ǣ�" + _request;
			break;
		case 2:
			this.request = "���ӵ������ǣ�" + _request;
			break;
		case 3:
			this.request = "ĸ�׵������ǣ�" + _request;
		}
	}

	// ����Լ���״��
	public int getType() {
		return this.type;
	}

	// ��ùŴ�Ů�˵�����
	public String getRequest() {
		return this.request;
	}

}
