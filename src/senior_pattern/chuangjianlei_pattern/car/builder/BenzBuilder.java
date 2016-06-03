package senior_pattern.chuangjianlei_pattern.car.builder;

public class BenzBuilder extends CarBuilder {

	@Override
	protected String buildWheel() {
		return super.getBlueprint().getWheel();
	}

	@Override
	protected String buildEngine() {
		return super.getBlueprint().getEngine();
	}

}
