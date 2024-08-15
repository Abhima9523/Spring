package com.jspider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver 
{
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/jspider/config.xml");
		Student b = ac.getBean("student",Student.class);
		Student b1 = ac.getBean("student",Student.class);
		System.out.println(b.getAge());
		System.out.println(b.getClasss());
		System.out.println(b.getSchool());
		System.out.println("============");
		System.out.println(b.hashCode());
		System.out.println(b1.hashCode());
	}

}
