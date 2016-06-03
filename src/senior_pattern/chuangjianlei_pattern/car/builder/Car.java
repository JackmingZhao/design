package senior_pattern.chuangjianlei_pattern.car.builder;

/**
 * 汽车具体实现类，需要轮子和发动机
 * @author lenovo
 *
 */
public class Car implements ICar {
	//汽车引擎
	private String engine;
	//汽车车轮
	private String wheel;
	
	Car(String _engine, String _wheel) {
		this.engine=_engine;
		this.wheel=_wheel;
	}

	@Override
	public String getWheel() {
		return wheel;
	}

	@Override
	public String getEngine() {
		return engine;
	}
	
	@Override
	public String toString() {
		return "车的轮子是：" + wheel + "\n车的引擎是：" + engine;
	}

}
