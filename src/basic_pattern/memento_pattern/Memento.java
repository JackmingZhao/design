package basic_pattern.memento_pattern;

/**
 * ����¼�����ڴ洢����״̬
 * @author lenovo
 *
 */
public class Memento {
	Memento(String state) {
		this.state=state;
	}
	
	private String state = "";
	//��ȡ����¼��״̬
	public String getState() {
		return this.state;
	}
	//���ñ���¼״̬
	public void setState(String state) {
		this.state=state;
	}

}