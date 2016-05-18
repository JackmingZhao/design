package memento_pattern;

public class Boy {
	
	private String state="";
	
	//�ı�״̬��
	public void changeState() {
		this.state="������ܺܲ���";
	}
	//��õ�ǰ״̬
	public String getState() {
		return this.state;
	}
	//������״̬
	public void setState(String _state) {
		this.state=_state;
	}
	//�������ڱ���ı���¼����������൱ǰ���״̬������һ������
	public Memento createMemento() {
		return new Memento(this.state);
	}
	//���õ�ǰ��ı���¼���ָ�һ������
	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}

}
