package com.prc.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Squre implements Shape
{
	
	public void print() {
		System.out.println("it	has	4	sides");
	}
	

}
