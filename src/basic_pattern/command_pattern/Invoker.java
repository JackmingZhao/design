package basic_pattern.command_pattern;

public class Invoker {
	
	private Command command;
	
	public void setCommand(Command _command) {
		this.command = _command;
	}
	//�������ҵ���ǰ������ִ���߽���ִ��
	public void action() {
		this.command.execute();
	}

}
