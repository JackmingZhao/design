package proxy_pattern.dynamic_proxy;

/**
 * ��ʵ����ʵ����
 * 
 * @author lenovo
 *
 */
public class RealGamePlayer implements IGamePlayer {
	private String name = "";

	RealGamePlayer(String _name) {
		this.name = _name;
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "��ɱBOSS.....");
	}

	@Override
	public void login(String user, String password) {
		System.out.println(this.name + "�ѵ�½......");
	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "��������......");
	}

}
