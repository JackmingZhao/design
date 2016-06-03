package basic_pattern.memento_pattern;

/**
 * 备忘录，用于存储备份状态
 * @author lenovo
 *
 */
public class Memento {
	Memento(String state) {
		this.state=state;
	}
	
	private String state = "";
	//获取备忘录的状态
	public String getState() {
		return this.state;
	}
	//设置备忘录状态
	public void setState(String state) {
		this.state=state;
	}

}