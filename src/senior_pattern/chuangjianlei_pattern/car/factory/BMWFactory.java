package senior_pattern.chuangjianlei_pattern.car.factory;

public class BMWFactory implements CarFactory {

	@Override
	public ICar createSuv() {
		return new BMWSuv();
	}

	@Override
	public ICar createVan() {
		return new BMWVan();
	}

}
