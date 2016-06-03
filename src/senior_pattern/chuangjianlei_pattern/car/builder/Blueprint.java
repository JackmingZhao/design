package senior_pattern.chuangjianlei_pattern.car.builder;

/**
 * 设计蓝图
 * 根据蓝图类进行具体车辆建造
 * @author lenovo
 *
 */
public class Blueprint {
	
	// 车轮的要求
	private String wheel;
	// 引擎的要求
	private String engine;

	public String getWheel() {
		return wheel;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

}
