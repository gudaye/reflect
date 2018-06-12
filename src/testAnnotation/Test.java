package testAnnotation;

import java.lang.annotation.Annotation;

@MyAnnotation(name="gushuang",value="hello")
public class Test {

	public static void main(String[] args) {
		
		MyAnnotation annotation = Test.class.getAnnotation(MyAnnotation.class);
		
		
		Annotation[] annotations = Test.class.getAnnotations();
		
		for (int i = 0; i < annotations.length; i++) {
			System.out.println(annotations[i]);
		}
		
		System.out.println(annotation);
		System.out.println(annotation.name()+" "+annotation.value());
		
	}
	
}
