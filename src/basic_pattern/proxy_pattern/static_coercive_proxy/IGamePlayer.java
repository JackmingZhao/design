package basic_pattern.proxy_pattern.static_coercive_proxy;

/**
 * 真实的主题接口
 * @author lenovo
 *
 */
public interface IGamePlayer {
	
	public void killBoss();
	public void login(String user, String password);
	public void upgrade();
	public IGamePlayer getProxy();

}
