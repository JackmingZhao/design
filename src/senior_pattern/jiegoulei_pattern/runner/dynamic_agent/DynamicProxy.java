package senior_pattern.jiegoulei_pattern.runner.dynamic_agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Random;
/**
 * 动态代理类，可以在newProxyInstance方法中针对不同参数进行业务处理，即添加通知处理
 * @author lenovo
 *
 * @param <T>
 */
public class DynamicProxy<T> {
	
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
		Random random = new Random();
		if(random.nextBoolean()) {
			System.out.println("代理人同意安排运动员跑步");
			return (T) Proxy.newProxyInstance(loader, interfaces, handler);
		} else {
			System.out.println("代理人心情不好，不安排运动员跑步");
			return null;
		}
	}

}
