package senior_pattern.chuangjianlei_pattern.car.builder;

/**
 * 按照设计蓝图制造零件
 * @author lenovo
 *
 */
public class BMWBuilder extends CarBuilder {

	@Override
	protected String buildWheel() {
		return super.getBlueprint().getWheel();
	}

	@Override
	protected String buildEngine() {
		return super.getBlueprint().getEngine();
	}



}
