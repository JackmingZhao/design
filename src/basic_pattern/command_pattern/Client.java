package basic_pattern.command_pattern;

/**
 * ����ģʽ
 * @author lenovo
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		System.out.println("------------�ͻ�Ҫ������һ������---------------");
		//��������ֱ����������ִ��Ҳ���ԣ�����û�����������ط������е�ִ�ж�Ӧ�ý���һ�����еĶ���ִ��
		RequirementCommand command = new RequirementCommand();
		invoker.setCommand(command);
		//����������ȥִ��
		invoker.action();
	}

}
