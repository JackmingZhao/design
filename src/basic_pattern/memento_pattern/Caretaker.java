package basic_pattern.memento_pattern;

/**
 * ����¼������
 * @author lenovo
 *
 */
public class Caretaker {
	
	private Memento memento;
	
	public Memento getMemento() {
		return memento;
	}
	
	public void setMemento(Memento memento) {
		this.memento=memento;
	}

}
