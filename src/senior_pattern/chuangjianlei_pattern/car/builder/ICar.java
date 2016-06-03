package senior_pattern.chuangjianlei_pattern.car.builder;

/**
 * 一个车，由车轮和发动机组成
 * @author lenovo
 *
 */
public interface ICar {
	
	//汽车车轮
	public String getWheel();
	//汽车引擎
	public String getEngine();

}
