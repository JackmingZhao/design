package basic_pattern.adapter_pattern.object_adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfo = new HashMap();
		homeInfo.put("homeTelNumbner", "Ա���ļ�ͥ�绰��...");
		homeInfo.put("homeAddress", "Ա���ļ�ͥ��ַ��...");
		return homeInfo;
	}

}
