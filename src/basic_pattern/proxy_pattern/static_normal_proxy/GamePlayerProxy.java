package basic_pattern.proxy_pattern.static_normal_proxy;

public class GamePlayerProxy implements IGamePlayer {
	private IGamePlayer gamePlayer;
	//������������֪��������˭
	public GamePlayerProxy(String name) {
		try {
			this.gamePlayer=new GamePlayer(this, name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}

	@Override
	public void killBoss() {
		System.out.print("����");
		this.gamePlayer.killBoss();
	}

	@Override
	public void login(String user, String password) {
		System.out.print("����");
		this.gamePlayer.login(user, password);
	}

	@Override
	public void upgrade() {
		System.out.print("����");
		this.gamePlayer.upgrade();
	}

}
