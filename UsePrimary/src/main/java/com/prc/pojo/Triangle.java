package com.prc.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Triangle implements Shape{


	public void print() {
		System.out.println("it	has	3	sides");
	}

}
