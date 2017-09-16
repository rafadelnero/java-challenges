package com.javachallenges;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/** Soon you will see the answers on 
 *   nobugsproject.com */
public class AnnotationChallenge {
	@CrazyAnnotation(value = "Class")
	static class AnnotatedClass { @CrazyAnnotation(value="Method")
		void doStuff() { System.out.println("Doing stuff!"); } }

	public static void main(String... doYourBest) 
			throws NoSuchFieldException, SecurityException {
		String result = "";
		for (Annotation annotation : AnnotatedClass.class
				.getDeclaredAnnotations()) {
			result += annotation.annotationType().getName();
		}
		for (Method method : AnnotatedClass.
				class.getDeclaredMethods()) {
			CrazyAnnotation annotation = method.getAnnotation(
					CrazyAnnotation.class);
			result += annotation.value();
		}
		System.out.println(result); 	}
} @Retention(RetentionPolicy.RUNTIME)  @interface CrazyAnnotation 
{ String value(); }

//// CrazyAnnotationMethod
///  com.javachallenges.CrazyAnnotationMethod
///x

