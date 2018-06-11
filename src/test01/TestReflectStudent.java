package test01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class TestReflectStudent {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class stu = Student.class;
		
		Class<Student> stu2 = (Class<Student>) Class.forName("test01.Student");
		
		int modifiers = stu.getModifiers();
		System.out.println(modifiers);
		
		boolean public1 = Modifier.isPublic(modifiers);
		System.out.println(public1);
		
		Package package1 = stu2.getPackage();
		
		String name = package1.getName();
		System.out.println(name);
		
		Class<? super Student> superclass = stu2.getSuperclass();
		System.out.println(superclass.getName());
		
		Class<?>[] interfaces = stu2.getInterfaces();
		for (int i = 0; i < interfaces.length; i++) {
			System.out.println(interfaces[i]);
		}
		
		Constructor<?>[] constructors = stu2.getConstructors();
		for(int i=0;i<constructors.length;i++) {
			Constructor<?> constructor = constructors[i];
		}
	}
	
}
