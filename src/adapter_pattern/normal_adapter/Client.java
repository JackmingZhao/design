package adapter_pattern.normal_adapter;

public class Client {

	public static void main(String[] args) {
		// û������ϵͳ���ӵ�ʱ��������д��
		//IUserInfo youngGirl = new UserInfo();
		//����ֻ�޸�����仰��ʹ����������ɫ���Ա����Ϣ
		IUserInfo youngGirl = new OuterUserInfo();
		// �����ݿ��в鵽3��
		for (int i = 0; i < 3; i++) {
			youngGirl.getMobileNumber();
		}
	}

}
