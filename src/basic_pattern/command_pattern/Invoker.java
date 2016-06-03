package basic_pattern.command_pattern;

public class Invoker {
	
	private Command command;
	
	public void setCommand(Command _command) {
		this.command = _command;
	}
	//调用者找到当前的命令执行者进行执行
	public void action() {
		this.command.execute();
	}

}
