package senior_pattern.chuangjianlei_pattern.car.builder;

/**
 * ��������ʵ���࣬��Ҫ���Ӻͷ�����
 * @author lenovo
 *
 */
public class Car implements ICar {
	//��������
	private String engine;
	//��������
	private String wheel;
	
	Car(String _engine, String _wheel) {
		this.engine=_engine;
		this.wheel=_wheel;
	}

	@Override
	public String getWheel() {
		return wheel;
	}

	@Override
	public String getEngine() {
		return engine;
	}
	
	@Override
	public String toString() {
		return "���������ǣ�" + wheel + "\n���������ǣ�" + engine;
	}

}
