package basic_pattern.proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {
	
	//被代理对象
	private Object obj = null;
	
	GamePlayerIH(Object _obj) {
		this.obj = _obj;
	}

	//调用被代理方法
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = method.invoke(this.obj, args);
		if(method.getName().equalsIgnoreCase("login")) {
			System.out.println("有人在用我的账号");
		}
		return result;
	}

}
