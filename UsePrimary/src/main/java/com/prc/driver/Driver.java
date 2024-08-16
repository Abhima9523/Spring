package com.prc.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prc.config.Config;
import com.prc.pojo.ShapeApp;





public class Driver 
{
	public static void main(String[] args) {
		ApplicationContext Ac = new AnnotationConfigApplicationContext(Config.class);
		ShapeApp sa = Ac.getBean("shapeApp", ShapeApp.class);
		sa.pritntshape();

	}


}
