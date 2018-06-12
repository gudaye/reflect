package testprivate;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {
		PrivateClass newInstance = PrivateClass.class.newInstance();
		Field field = PrivateClass.class.getDeclaredField("name");
		field.setAccessible(true);
		field.set(newInstance, "gushuang");
		System.out.println(newInstance);
		
		Object object = field.get(newInstance);
		System.out.println(object);
	}
	
}
