package senior_pattern.jiegoulei_pattern.runner.decorator;

public class Client {

	public static void main(String[] args) {
		//����һ���˶�Ա
		IRunner runner = new Runner();
		//ʹ��װ������ǿ����
		IRunner decorator = new RunnerDecorator(runner);
		//���������ܲ�������
		System.out.println("===��ǿ����˶�Ա�Ĺ���===");
		decorator.run();
	}

}
