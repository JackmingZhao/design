package proxy_pattern.static_normal_proxy;

/**
 * ��ͨ����
 * @author lenovo
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		// ����һ��������
		IGamePlayer proxy = new GamePlayerProxy("����");
		// ��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ���ǣ�2009-8-25 10:45");
		proxy.login("zhangSan", "password");
		// ��ʼɱ��
		proxy.killBoss();
		// ����
		proxy.upgrade();
		// ��¼������Ϸʱ��
		System.out.println("����ʱ���ǣ�2009-8-26 03:40");
	}

}
