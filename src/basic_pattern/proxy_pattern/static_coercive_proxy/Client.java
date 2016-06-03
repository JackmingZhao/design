package basic_pattern.proxy_pattern.static_coercive_proxy;

/**
 * 强制静态代理
 * @author lenovo
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		IGamePlayer gamePlayer = new RealGamePlayer("李四");
		IGamePlayer proxy = gamePlayer.getProxy();
		//IGamePlayer proxy = new GamePlayerProxy(new RealGamePlayer("李四"));
		// 开始打游戏，记下时间戳
		System.out.println("开始时间是：2016-5-9 10:45");
		proxy.login("lisi", "password");
		// 开始杀怪
		proxy.killBoss();
		// 升级
		proxy.upgrade();
		// 记录结束游戏时间
		System.out.println("结束时间是：2016-5-9 03:40");
	}

}
