package senior_pattern.chuangjianlei_pattern.car.builder;

public class Director {
	private BMWBuilder bmwBuilder = new BMWBuilder();
	private BenzBuilder benzBuilder = new BenzBuilder();
	
	// 生产奔驰SUV
	public ICar createBenzSuv() {
		// 制造出汽车
		return createCar(benzBuilder, "benz的引擎", "benz的轮胎");
	}

	// 生产出一辆宝马商务车
	public ICar createBMWVan() {
		return createCar(benzBuilder, "BMW的引擎", "BMW的轮胎");
	}

	// 生产出一个混合车型
	public ICar createComplexCar() {
		return createCar(bmwBuilder, "BMW的引擎", "benz的轮胎");
	}
	
	// 生产车辆
	private ICar createCar(CarBuilder _carBuilder, String engine, String wheel) {
		// 导演怀揣蓝图
		Blueprint bp = new Blueprint();
		bp.setEngine(engine);
		bp.setWheel(wheel);
		System.out.println("获得生产蓝图");
		_carBuilder.receiveBlueprint(bp);
		return _carBuilder.buildCar();
	}

}
