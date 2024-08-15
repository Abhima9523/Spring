package com.jspider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jspider")
public class ConfigurationClass {
	@Bean("mystd")
	public Student getStudent()
	{
		return new Student();
	}

}
