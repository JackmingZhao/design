package basic_pattern.observer_pattern.normal_observer;

/**
 * ���۲��߳���ӿ�
 * @author lenovo
 *
 */
public interface Observable {
	
	//����һ���۲���
	public void addObserver(Observer observer);
	//ɾ��һ���۲���
	public void deleteObserver(Observer observer);
	//֪ͨ�۲���
	public void notifyObserver(String context);

}
