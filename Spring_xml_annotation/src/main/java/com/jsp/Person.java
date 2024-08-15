package com.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value(value="44")
	public void run()
	{
		System.out.println("Person in Running .........");
	}

}
