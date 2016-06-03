package basic_pattern.responsibility_chain_pattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * ������ģʽ
 * @author lenovo
 *
 */
public class Client {

	public static void main(String[] args) {
		// �����ѡ�����Ŵ���Ů
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
		for (int i = 0; i < 5; i++) {
			arrayList.add(new Women(rand.nextInt(4), "��Ҫ��ȥ���"));
		}
		for (IWomen women : arrayList) {
			Chain.getHandler().handerlMessage(women);
		}
	}

}

class Chain {
	public static IHandler getHandler() {
		// ����������ʾ����
		IHandler father = new Father();
		IHandler husband = new Husband();
		IHandler son = new Son();
		// ������ʾ˳��
		father.setNest(husband);
		husband.setNest(son);
		return father;
	}
}
