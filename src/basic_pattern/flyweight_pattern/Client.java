package basic_pattern.flyweight_pattern;

public class Client {

	public static void main(String[] args) {
		// ��ʼ�������
		for (int i = 0; i < 4; i++) {
			String subject = "��Ŀ" + i;
			// ��ʼ����ַ
			for (int j = 0; j < 30; j++) {
				String key = subject + "���Եص�" + j;
				SignInfoFactory.getSignInfo(key);
			}
		}
		SignInfoFactory.getSignInfo("��Ŀ1���Եص�1");
		
		//�ڶ�����г�ʼ��4������  ���߳�����
		/*SignInfoFactory.getSignInfo("��Ŀ1");
		SignInfoFactory.getSignInfo("��Ŀ2");
		SignInfoFactory.getSignInfo("��Ŀ3");
		SignInfoFactory.getSignInfo("��Ŀ4");*/
		// ȡ�ö���
		/*SignInfo signInfo = SignInfoFactory.getSignInfo("��Ŀ2");
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
