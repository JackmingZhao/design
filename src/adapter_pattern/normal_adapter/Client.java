package adapter_pattern.normal_adapter;

public class Client {

	public static void main(String[] args) {
		// 没有与外系统连接的时候，是这样写的
		//IUserInfo youngGirl = new UserInfo();
		//我们只修改了这句话，使用适配器角色获得员工信息
		IUserInfo youngGirl = new OuterUserInfo();
		// 从数据库中查到3个
		for (int i = 0; i < 3; i++) {
			youngGirl.getMobileNumber();
		}
	}

}
