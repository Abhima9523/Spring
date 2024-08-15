package com.jspider;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver 
{
	public static void main(String[] args) 
	{
		BeanFactory b= new ClassPathXmlApplicationContext("myspring.xml");
		person p=b.getBean("myperson",person.class);
		p.messege();
		
	}

}
