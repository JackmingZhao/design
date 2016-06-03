package senior_pattern.chuangjianlei_pattern.car.factory;

public abstract class AbsBMW implements ICar {

	@Override
	public String getBand() {
		return "宝马汽车";
	}

	/**
	 * 具体型号由具体实现类实现
	 */
	@Override
	public abstract String getModel();

}
