package senior_pattern.chuangjianlei_pattern.car.builder;

/**
 * 抽象的建造类
 * 抽象出具体需要的零件（由子类去创建）并组装成一量车
 * 由设计蓝图决定具体零件
 * @author lenovo
 *
 */
public abstract class CarBuilder {
	
	private Blueprint bp;
	
	public Car buildCar() {
		return new Car(buildEngine(), buildWheel());
	}
	
	//接收一个设计图，根据设计图的要求建造出相关零件
	public void receiveBlueprint(Blueprint _bp) {
		this.bp = _bp;
	}
	
	// 查看蓝图，只有真正的建造者才可以查看蓝图
	protected Blueprint getBlueprint() {
		return bp;
	}
	
	protected abstract String buildWheel();
	
	protected abstract String buildEngine();

}
