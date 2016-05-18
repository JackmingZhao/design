package observer_pattern.normal_observer;

/**
 * 观察者的接口
 * @author lenovo
 *
 */
public interface Observer {
	
	//一发现别人有动静，自己也要行动起来
	public void update(String context);

}
