package basic_pattern.proxy_pattern.static_coercive_proxy;

/**
 * ǿ�ƾ�̬����
 * @author lenovo
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		IGamePlayer gamePlayer = new RealGamePlayer("����");
		IGamePlayer proxy = gamePlayer.getProxy();
		//IGamePlayer proxy = new GamePlayerProxy(new RealGamePlayer("����"));
		// ��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ���ǣ�2016-5-9 10:45");
		proxy.login("lisi", "password");
		// ��ʼɱ��
		proxy.killBoss();
		// ����
		proxy.upgrade();
		// ��¼������Ϸʱ��
		System.out.println("����ʱ���ǣ�2016-5-9 03:40");
	}

}
