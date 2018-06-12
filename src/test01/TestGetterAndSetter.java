package test01;

import java.lang.reflect.Method;

public class TestGetterAndSetter {

	public static void main(String[] args) {

		Method[] methods = Student.class.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			String name = method.getName();
			Class<?>[] parameterTypes = method.getParameterTypes();
			System.out.println(name+" "+parameterTypes.getClass().getName());
		}
		
	}
	
	
}
