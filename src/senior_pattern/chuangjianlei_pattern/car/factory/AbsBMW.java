package senior_pattern.chuangjianlei_pattern.car.factory;

public abstract class AbsBMW implements ICar {

	@Override
	public String getBand() {
		return "��������";
	}

	/**
	 * �����ͺ��ɾ���ʵ����ʵ��
	 */
	@Override
	public abstract String getModel();

}
