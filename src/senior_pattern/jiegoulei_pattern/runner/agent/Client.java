package senior_pattern.jiegoulei_pattern.runner.agent;

public class Client {

	public static void main(String[] args) {
		//����һ�������˶�Ա
		IRunner runner = new Runner();
		//���������
		IRunner agent = new RunnerAgent(runner);
		//Ҫ���˶�Ա�ܲ�
		System.out.println("====�����ҵ��˶�Ա�Ĵ���Ҫ����ȥ�ܲ�===");
		agent.run();
	}

}
