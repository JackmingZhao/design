package senior_pattern.jiegoulei_pattern.runner.dynamic_agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Random;
/**
 * ��̬�����࣬������newProxyInstance��������Բ�ͬ��������ҵ���������֪ͨ����
 * @author lenovo
 *
 * @param <T>
 */
public class DynamicProxy<T> {
	
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
		Random random = new Random();
		if(random.nextBoolean()) {
			System.out.println("������ͬ�ⰲ���˶�Ա�ܲ�");
			return (T) Proxy.newProxyInstance(loader, interfaces, handler);
		} else {
			System.out.println("���������鲻�ã��������˶�Ա�ܲ�");
			return null;
		}
	}

}
