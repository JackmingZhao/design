package basic_pattern.adapter_pattern.object_adapter;

/**
 * ����������
 * @author lenovo
 *
 */
public class Client {

	public static void main(String[] args) {
		// ��ϵͳ����Ա��Ϣ
		IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
		IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
		IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
		// ������������
		IUserInfo youngGirl = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
		// �����ݿ��в鵽101��
		for (int i = 0; i < 3; i++) {
			youngGirl.getMobileNumber();
		}
	}

}
