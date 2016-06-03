package basic_pattern.proxy_pattern.static_normal_proxy;

public class GamePlayer implements IGamePlayer {
	//玩家名称
	private String name;
	//判断谁能创建真实的角色，只有代理创建真实角色
	public GamePlayer(IGamePlayer _gamePlayer, String _name) throws Exception {
		if(_gamePlayer==null) {
			throw new Exception("不能创建真实角色！");
		}
		this.name=_name;
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "在打怪！");
	}

	@Override
	public void login(String user, String password) {
		System.out.println("登录名为"+user + "的用户" + this.name + "登录成功！");
	}

	@Override
	public void upgrade() {
		System.out.println(this.name + " 又升了一级！");
	}

}
