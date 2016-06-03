package basic_pattern.proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {
	
	//���������
	private Object obj = null;
	
	GamePlayerIH(Object _obj) {
		this.obj = _obj;
	}

	//���ñ�������
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = method.invoke(this.obj, args);
		if(method.getName().equalsIgnoreCase("login")) {
			System.out.println("���������ҵ��˺�");
		}
		return result;
	}

}
