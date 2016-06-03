package basic_pattern.flyweight_pattern;

public class MultiThread extends Thread {
	private SignInfo signInfo;

	public MultiThread(SignInfo _signInfo) {
		this.signInfo = _signInfo;
	}

	public void run() {
		if (!signInfo.getId().equals(signInfo.getLocation())) {
			System.out.println("��ţ�" + signInfo.getId());
			System.out.println("���Ե�ַ��" + signInfo.getLocation());
			System.out.println("�̲߳���ȫ�ˣ�");
		}
	}
}
