package senior_pattern.chuangjianlei_pattern.car.factory;

public class BenzFactory implements CarFactory {

	@Override
	public ICar createSuv() {
		return new BenzSuv();
	}

	@Override
	public ICar createVan() {
		return new BenzVan();
	}

}
