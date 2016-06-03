package senior_pattern.jiegoulei_pattern.runner.dynamic_agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 动态代理调用的处理器，通过反射执行被代理方法
 * @author lenovo
 *
 */
public class MyInvocationHandler implements InvocationHandler {
	private Object obj;
	public MyInvocationHandler(Object _obj) {
		this.obj = _obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(this.obj, args);
	}

}
