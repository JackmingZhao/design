package basic_pattern.proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	
	public static void main(String[] args) {
		//定义一个被代理对象
		IGamePlayer player = new RealGamePlayer("张三");
		//定义一个Handler
		InvocationHandler handler = new GamePlayerIH(player);
		//开始打游戏，记下时间戳
		System.out.println("开始时间是：2016-5-9 10:45");
		//得到被代理对象的class loader
		ClassLoader cl = player.getClass().getClassLoader();
		//动态生成一个代理类
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
		proxy.login("zhangsan", "123");
		proxy.killBoss();
		proxy.upgrade();
		//记录结束游戏时间
		System.out.println("结束时间是：2016-5-9 03:40");
	}

}
