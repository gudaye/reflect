package test01;

import java.lang.reflect.Constructor;

/**
 * @author Administrator
 *
 */
public class TestConstructor {

	public static void main(String[] args) throws Exception {
		Constructor<Student> constructor = Student.class.getConstructor(String.class,String.class);
		Student student = constructor.newInstance("gushuang","123456");
		System.out.println(student);
	}
	
}
