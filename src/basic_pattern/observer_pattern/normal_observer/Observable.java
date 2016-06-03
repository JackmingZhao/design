package basic_pattern.observer_pattern.normal_observer;

/**
 * 被观察者抽象接口
 * @author lenovo
 *
 */
public interface Observable {
	
	//增加一个观察者
	public void addObserver(Observer observer);
	//删除一个观察者
	public void deleteObserver(Observer observer);
	//通知观察者
	public void notifyObserver(String context);

}
