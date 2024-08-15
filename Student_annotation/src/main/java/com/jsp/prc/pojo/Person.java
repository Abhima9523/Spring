package com.jsp.prc.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person 
{
	private int age;
	private String name;
	@Autowired
	private Mobile m;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Mobile getM() {
		return m;
	}
	public void setM(Mobile m) {
		this.m = m;
	}
	
	

}
