package com.jsp.prc.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.prc.config.Config;
import com.jsp.prc.pojo.Person;

public class Driver 
{
	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(Config.class);
		Person p=a.getBean("person",Person.class);
		p.getM().call();
		System.out.println(p.getM().getNumber());
	}

}
