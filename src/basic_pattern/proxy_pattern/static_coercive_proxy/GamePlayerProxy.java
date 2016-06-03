package basic_pattern.proxy_pattern.static_coercive_proxy;

/**
 * ���������
 * @author lenovo
 *
 */
public class GamePlayerProxy implements IGamePlayer {
	//��Ҫ֪���Ҵ�������ĸ�
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
