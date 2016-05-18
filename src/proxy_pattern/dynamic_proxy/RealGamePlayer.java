package proxy_pattern.dynamic_proxy;

/**
 * 真实主题实现类
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
		System.out.println(this.name + "在杀BOSS.....");
	}

	@Override
	public void login(String user, String password) {
		System.out.println(this.name + "已登陆......");
	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "已升级了......");
	}

}
