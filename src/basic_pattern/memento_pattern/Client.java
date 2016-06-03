package basic_pattern.memento_pattern;

public class Client {

	public static void main(String[] args) {
		//声明对象
		Boy boy = new Boy();
		//声明备忘录管理者
		Caretaker cm = new Caretaker();
		boy.setState("心情很棒！");
		System.out.println("=====男孩现在的状态======");
		System.out.println(boy.getState());
		//记录当前状态，进行备份
		cm.setMemento(boy.createMemento());
		//对象修改状态
		boy.changeState();
		System.out.println("\n=====男孩追女孩子后的状态======");
		System.out.println(boy.getState());
		//恢复备份
		boy.restoreMemento(cm.getMemento());
		System.out.println("\n=====男孩恢复后的状态======");
		System.out.println(boy.getState());
	}

}
