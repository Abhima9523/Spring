package com.jspiders;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver 
{
	public static void main(String[] args) 
	{
		BeanFactory b= new ClassPathXmlApplicationContext("Mysp.xml");
		Employee e= b.getBean("myEmployee",Employee.class);
		System.out.println(e.getAge());
		System.out.println(e.getName());
		System.out.println(e.getPancard());
		System.out.println(e.getExp());
		
	}

}
