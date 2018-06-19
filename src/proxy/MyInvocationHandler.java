package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{

	
	public void sayHello() {
		System.out.println("hello");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(proxy.getClass().getName());
		System.out.println(method.getName());
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		return null;
	}
	
}
