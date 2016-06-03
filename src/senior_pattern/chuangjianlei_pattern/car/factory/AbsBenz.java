package senior_pattern.chuangjianlei_pattern.car.factory;

public abstract class AbsBenz implements ICar {

	@Override
	public String getBand() {
		return "±¼³ÛÆû³µ";
	}

	@Override
	public abstract String getModel();

}
