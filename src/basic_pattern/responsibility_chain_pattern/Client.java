package basic_pattern.responsibility_chain_pattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * 责任链模式
 * @author lenovo
 *
 */
public class Client {

	public static void main(String[] args) {
		// 随机挑选几个古代妇女
		Random rand = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
		for (int i = 0; i < 5; i++) {
			arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
		}
		for (IWomen women : arrayList) {
			Chain.getHandler().handerlMessage(women);
		}
	}

}

class Chain {
	public static IHandler getHandler() {
		// 定义三个请示对象
		IHandler father = new Father();
		IHandler husband = new Husband();
		IHandler son = new Son();
		// 设置请示顺序
		father.setNest(husband);
		husband.setNest(son);
		return father;
	}
}
