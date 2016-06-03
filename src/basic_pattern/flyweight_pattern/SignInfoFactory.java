package basic_pattern.flyweight_pattern;

import java.util.HashMap;

public class SignInfoFactory {
	//池容器
	private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();
	// 报名信息的对象工厂
	@Deprecated
	public static SignInfo getSignInfo() {
		return new SignInfo();
	}
	
	//从池中获取对象
	public static SignInfo getSignInfo(String key) {
		//设置返回对象
		SignInfo result = null;
		//判断池中有没有对象，有则直接返回，没有则建立并放入池中返回
		if(!pool.containsKey(key)) {
			System.out.println(key + "----建立对象，并放置到池中");
			result = new SignInfoPool(key);
			pool.put(key, result);
		} else {
			result = pool.get(key);
			System.out.println(key +"---直接从池中取得");
		}
		return result;
	}
}
