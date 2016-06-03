package basic_pattern.proxy_pattern.static_coercive_proxy;

/**
 * ��ʵ����ʵ����
 * 
 * @author lenovo
 *
 */
public class RealGamePlayer implements IGamePlayer {
	private String name = "";
	private IGamePlayer proxy = null;

	RealGamePlayer(String _name) throws Exception {
		this.name = _name;
	}

	//�õ����Լ��Ĵ���
	@Override
	public IGamePlayer getProxy() {
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}

	@Override
	public void killBoss() {
		if (this.isProxy()) {
			System.out.println(this.name + "��ɱBOSS.....");
		} else {
			System.out.println("��ʹ����ȷ�Ĵ���");
		}
	}

	@Override
	public void login(String user, String password) {
		if (this.isProxy()) {
			System.out.println(this.name + "�ѵ�½......");
		} else {
			System.out.println("��ʹ����ȷ�Ĵ���");
		}
	}

	@Override
	public void upgrade() {
		if (this.isProxy()) {
			System.out.println(this.name + "��������......");
		} else {
			System.out.println("��ʹ����ȷ�Ĵ���");
		}
	}

	/*
	 * �ж��ǲ����Լ��Ĵ���
	 */
	private boolean isProxy() {
		if (this.proxy == null) {
			return false;
		} else {
			return true;
		}
	}

}
