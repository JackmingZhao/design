package basic_pattern.bridge_pattern;

public class HouseCorp extends Corp {
	
	public HouseCorp(House house) {
		super(house);
	}

	// ���ز���˾��High�ˣ�׬Ǯ����������
	public void makeMoney() {
		super.makeMoney();
		System.out.println("���ز���˾׬��Ǯ��...");
	}

}
