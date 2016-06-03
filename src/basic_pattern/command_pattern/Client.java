package basic_pattern.command_pattern;

/**
 * 命令模式
 * @author lenovo
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		System.out.println("------------客户要求增加一项需求---------------");
		//具体的命令，直接用命令来执行也可以，但是没有做到迪米特反则，所有的执行都应该交给一个公有的对象执行
		RequirementCommand command = new RequirementCommand();
		invoker.setCommand(command);
		//交给调用者去执行
		invoker.action();
	}

}
