package adapter_pattern.normal_adapter;

import java.util.Map;

/*
 * Դ��ɫ�������г����г�ͻ�����ֲ��ò�ʹ�õ�ҵ���� 
 */
public interface IOuterUser {
	// ������Ϣ���������ơ��Ա��ֻ������
	public Map getUserBaseInfo();

	// ����������Ϣ
	public Map getUserOfficeInfo();

	// �û��ļ�ͥ��Ϣ
	public Map getUserHomeInfo();
}
