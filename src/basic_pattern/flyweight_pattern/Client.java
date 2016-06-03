package basic_pattern.flyweight_pattern;

public class Client {

	public static void main(String[] args) {
		// 初始化对象池
		for (int i = 0; i < 4; i++) {
			String subject = "科目" + i;
			// 初始化地址
			for (int j = 0; j < 30; j++) {
				String key = subject + "考试地点" + j;
				SignInfoFactory.getSignInfo(key);
			}
		}
		SignInfoFactory.getSignInfo("科目1考试地点1");
		
		//在对象池中初始化4个对象  多线程问题
		/*SignInfoFactory.getSignInfo("科目1");
		SignInfoFactory.getSignInfo("科目2");
		SignInfoFactory.getSignInfo("科目3");
		SignInfoFactory.getSignInfo("科目4");*/
		// 取得对象
		/*SignInfo signInfo = SignInfoFactory.getSignInfo("科目2");
		while (true) {
			signInfo.setId("ZhangSan");
			signInfo.setLocation("ZhangSan");
			(new MultiThread(signInfo)).start();
			signInfo.setId("LiSi");
			signInfo.setLocation("LiSi");
			(new MultiThread(signInfo)).start();
		}*/
	}

}
