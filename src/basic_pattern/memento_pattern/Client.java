package basic_pattern.memento_pattern;

public class Client {

	public static void main(String[] args) {
		//��������
		Boy boy = new Boy();
		//��������¼������
		Caretaker cm = new Caretaker();
		boy.setState("����ܰ���");
		System.out.println("=====�к����ڵ�״̬======");
		System.out.println(boy.getState());
		//��¼��ǰ״̬�����б���
		cm.setMemento(boy.createMemento());
		//�����޸�״̬
		boy.changeState();
		System.out.println("\n=====�к�׷Ů���Ӻ��״̬======");
		System.out.println(boy.getState());
		//�ָ�����
		boy.restoreMemento(cm.getMemento());
		System.out.println("\n=====�к��ָ����״̬======");
		System.out.println(boy.getState());
	}

}
