package observer_pattern.jdk_observer;

import java.util.Observable;
import java.util.Observer;

public class Client {
	
	public static void main(String[] args) {
		//�����۲���
		Observer lisi = new LiSi();
		Observer liusi = new LiuSi();
		Observer wangsi = new WangSi();
		//���屻�۲���
		IHanFeiZi han = new HanFeiZi();
		((Observable)han).addObserver(wangsi);
		((Observable)han).addObserver(liusi);
		((Observable)han).addObserver(lisi);
		// Ȼ���������ǿ����������ڸ�ʲô
		han.haveBreakfast();
	}

}
