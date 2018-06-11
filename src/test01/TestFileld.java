package test01;

import java.lang.reflect.Field;

public class TestFileld {

	public static void main(String[] args) throws Exception {
		Student student = Student.class.newInstance();
		Field field = Student.class.getField("age");
		
		student.age = "ab";
		Object object = field.get(student);
		
		System.out.println(object);
		
		field.set(student, "28");
		
		System.out.println(student.age);
		
	}
	
}
