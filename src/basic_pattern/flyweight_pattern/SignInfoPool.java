package basic_pattern.flyweight_pattern;

public class SignInfoPool extends SignInfo {

	private String key;
	//构造函数获得相同标志
	public SignInfoPool(String _key){
		this.key = _key;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
}
