package basic_pattern.flyweight_pattern;

import java.util.HashMap;

public class SignInfoFactory {
	//������
	private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();
	// ������Ϣ�Ķ��󹤳�
	@Deprecated
	public static SignInfo getSignInfo() {
		return new SignInfo();
	}
	
	//�ӳ��л�ȡ����
	public static SignInfo getSignInfo(String key) {
		//���÷��ض���
		SignInfo result = null;
		//�жϳ�����û�ж�������ֱ�ӷ��أ�û��������������з���
		if(!pool.containsKey(key)) {
			System.out.println(key + "----�������󣬲����õ�����");
			result = new SignInfoPool(key);
			pool.put(key, result);
		} else {
			result = pool.get(key);
			System.out.println(key +"---ֱ�Ӵӳ���ȡ��");
		}
		return result;
	}
}
