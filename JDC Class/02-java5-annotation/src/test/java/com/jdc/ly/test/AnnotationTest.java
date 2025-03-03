package com.jdc.ly.test;


import org.junit.jupiter.api.Test;

import com.jdc.ly.Grade;
import com.jdc.ly.Student;

public class AnnotationTest {
	@Test
	void testName() throws NoSuchFieldException, NoSuchMethodException, SecurityException {
		Student stu=new Student("Andrew",22,50);
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
		System.out.println(stu.getClassName());
		System.out.println(stu.getMark());
		for(Grade g:stu.getGrade()) {
			System.out.println(g);
		}
	}

}
