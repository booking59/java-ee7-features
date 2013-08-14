package org.ee.demo;

import javax.enterprise.inject.Model;

@Model
public class IndexController {

	private String hello;
	
	public void doAction() {
		hello = "Hello JSF 2.2";
	}
	
	public String getHello() {
		return hello;
	}
	
}
