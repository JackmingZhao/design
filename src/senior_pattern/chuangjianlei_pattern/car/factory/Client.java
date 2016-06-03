package senior_pattern.chuangjianlei_pattern.car.factory;

/**
 * ���󹤳�ģʽ
 * ģ������������һ������ά�ȣ�Ʒ��Ϊ���ۺͱ�������������van���˶���suv
 * @author lenovo
 *
 */
public class Client {

	public static void main(String[] args) {
		//Ҫ������һ������SUV
		System.out.println("===Ҫ������һ������SUV===");
		//�����ҵ��������۳��Ĺ���
		System.out.println("A���ҵ����۳�����");
		CarFactory carFactory = new BenzFactory();
		//��ʼ��������SUV
		System.out.println("B����ʼ��������SUV");
		ICar benzSuv = carFactory.createSuv();
		//������ϣ�չʾһ�³�����Ϣ
		System.out.println("C�����������������£�");
		System.out.println("����Ʒ�ƣ�"+benzSuv.getBand());
		System.out.println("�����ͺţ�" + benzSuv.getModel());
	}

}
