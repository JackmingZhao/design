package senior_pattern.chuangjianlei_pattern.car.builder;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		//����һ�����۳�SUV
		System.out.println("===����һ������SUV===");
		ICar benzSuv = director.createBenzSuv();
		System.out.println(benzSuv);
		//����һ����������
		System.out.println("\n===����һ����������===");
		ICar bmwVan = director.createBMWVan();
		System.out.println(bmwVan);
		//����һ����ϳ���
		System.out.println("\n===����һ����ϳ�===");
		ICar complexCar = director.createComplexCar();
		System.out.println(complexCar);
	}

}
