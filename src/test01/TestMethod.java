package test01;

import java.lang.reflect.Method;

public class TestMethod {

	public static void main(String[] args) throws Exception {
		Student newInstance = Student.class.newInstance();
		Method method = Student.class.getMethod("setName", String.class);
		method.invoke(newInstance, "1");
		System.out.println(newInstance.getName());
	}
	
}
