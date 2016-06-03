package basic_pattern.proxy_pattern.static_normal_proxy;

public class GamePlayer implements IGamePlayer {
	//�������
	private String name;
	//�ж�˭�ܴ�����ʵ�Ľ�ɫ��ֻ�д�������ʵ��ɫ
	public GamePlayer(IGamePlayer _gamePlayer, String _name) throws Exception {
		if(_gamePlayer==null) {
			throw new Exception("���ܴ�����ʵ��ɫ��");
		}
		this.name=_name;
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "�ڴ�֣�");
	}

	@Override
	public void login(String user, String password) {
		System.out.println("��¼��Ϊ"+user + "���û�" + this.name + "��¼�ɹ���");
	}

	@Override
	public void upgrade() {
		System.out.println(this.name + " ������һ����");
	}

}
