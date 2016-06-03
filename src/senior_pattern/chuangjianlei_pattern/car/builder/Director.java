package senior_pattern.chuangjianlei_pattern.car.builder;

public class Director {
	private BMWBuilder bmwBuilder = new BMWBuilder();
	private BenzBuilder benzBuilder = new BenzBuilder();
	
	// ��������SUV
	public ICar createBenzSuv() {
		// ���������
		return createCar(benzBuilder, "benz������", "benz����̥");
	}

	// ������һ����������
	public ICar createBMWVan() {
		return createCar(benzBuilder, "BMW������", "BMW����̥");
	}

	// ������һ����ϳ���
	public ICar createComplexCar() {
		return createCar(bmwBuilder, "BMW������", "benz����̥");
	}
	
	// ��������
	private ICar createCar(CarBuilder _carBuilder, String engine, String wheel) {
		// ���ݻ�����ͼ
		Blueprint bp = new Blueprint();
		bp.setEngine(engine);
		bp.setWheel(wheel);
		System.out.println("���������ͼ");
		_carBuilder.receiveBlueprint(bp);
		return _carBuilder.buildCar();
	}

}
