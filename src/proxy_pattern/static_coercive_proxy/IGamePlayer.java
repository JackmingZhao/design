package proxy_pattern.static_coercive_proxy;

/**
 * ��ʵ������ӿ�
 * @author lenovo
 *
 */
public interface IGamePlayer {
	
	public void killBoss();
	public void login(String user, String password);
	public void upgrade();
	public IGamePlayer getProxy();

}
