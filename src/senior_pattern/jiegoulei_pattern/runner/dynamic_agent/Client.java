package senior_pattern.jiegoulei_pattern.runner.dynamic_agent;

import java.lang.reflect.InvocationHandler;

public class Client {

	public static void main(String[] args) {
		//��������
		IRunner runner = new Runner();
		//���������handler
		InvocationHandler handler = new MyInvocationHandler(runner);
		IRunner proxy = DynamicProxy.newProxyInstance(runner.getClass().getClassLoader(), runner.getClass().getInterfaces(), handler);
		if(proxy != null)
			proxy.run();
	}

}
