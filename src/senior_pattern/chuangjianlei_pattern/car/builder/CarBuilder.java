package senior_pattern.chuangjianlei_pattern.car.builder;

/**
 * ����Ľ�����
 * �����������Ҫ�������������ȥ����������װ��һ����
 * �������ͼ�����������
 * @author lenovo
 *
 */
public abstract class CarBuilder {
	
	private Blueprint bp;
	
	public Car buildCar() {
		return new Car(buildEngine(), buildWheel());
	}
	
	//����һ�����ͼ���������ͼ��Ҫ�����������
	public void receiveBlueprint(Blueprint _bp) {
		this.bp = _bp;
	}
	
	// �鿴��ͼ��ֻ�������Ľ����߲ſ��Բ鿴��ͼ
	protected Blueprint getBlueprint() {
		return bp;
	}
	
	protected abstract String buildWheel();
	
	protected abstract String buildEngine();

}
