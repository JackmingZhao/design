package basic_pattern.proxy_pattern.static_coercive_proxy;

/**
 * 真实主题实现类
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

	//得到我自己的代理
	@Override
	public IGamePlayer getProxy() {
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}

	@Override
	public void killBoss() {
		if (this.isProxy()) {
			System.out.println(this.name + "在杀BOSS.....");
		} else {
			System.out.println("请使用正确的代理");
		}
	}

	@Override
	public void login(String user, String password) {
		if (this.isProxy()) {
			System.out.println(this.name + "已登陆......");
		} else {
			System.out.println("请使用正确的代理");
		}
	}

	@Override
	public void upgrade() {
		if (this.isProxy()) {
			System.out.println(this.name + "已升级了......");
		} else {
			System.out.println("请使用正确的代理");
		}
	}

	/*
	 * 判断是不是自己的代理
	 */
	private boolean isProxy() {
		if (this.proxy == null) {
			return false;
		} else {
			return true;
		}
	}

}
