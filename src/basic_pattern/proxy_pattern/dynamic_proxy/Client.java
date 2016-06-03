package basic_pattern.proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	
	public static void main(String[] args) {
		//����һ�����������
		IGamePlayer player = new RealGamePlayer("����");
		//����һ��Handler
		InvocationHandler handler = new GamePlayerIH(player);
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ���ǣ�2016-5-9 10:45");
		//�õ�����������class loader
		ClassLoader cl = player.getClass().getClassLoader();
		//��̬����һ��������
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
		proxy.login("zhangsan", "123");
		proxy.killBoss();
		proxy.upgrade();
		//��¼������Ϸʱ��
		System.out.println("����ʱ���ǣ�2016-5-9 03:40");
	}

}
