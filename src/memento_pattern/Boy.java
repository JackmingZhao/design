package memento_pattern;

public class Boy {
	
	private String state="";
	
	//改变状态了
	public void changeState() {
		this.state="心情可能很不好";
	}
	//获得当前状态
	public String getState() {
		return this.state;
	}
	//设置类状态
	public void setState(String _state) {
		this.state=_state;
	}
	//创建关于本类的备忘录，传入的是类当前这个状态，创建一个备份
	public Memento createMemento() {
		return new Memento(this.state);
	}
	//重置当前类的备忘录，恢复一个备份
	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}

}
