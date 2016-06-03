package basic_pattern.proxy_pattern.static_coercive_proxy;

/**
 * 主题代理类
 * @author lenovo
 *
 */
public class GamePlayerProxy implements IGamePlayer {
	//需要知道我代理的是哪个
	private IGamePlayer gramePlayer = null;
	
	GamePlayerProxy(IGamePlayer _gramePlayer) {
		this.gramePlayer=_gramePlayer;
	}

	@Override
	public void killBoss() {
		this.gramePlayer.killBoss();
	}

	@Override
	public void login(String user, String password) {
		this.gramePlayer.login(user, password);
	}

	@Override
	public void upgrade() {
		this.gramePlayer.upgrade();
	}
	
	public IGamePlayer getProxy() {
		return this;
	}

}
