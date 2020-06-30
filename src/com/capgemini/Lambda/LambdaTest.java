package com.capgemini.Lambda;

interface HelloWorld {
	String hello(String name);
}
public class LambdaTest {
	
	

	public static void main(String[] args) {
		HelloWorld helloWorld = (String name) -> {
			return "Hello " + name;
		};
		System.out.println(helloWorld.hello("Santhosh"));
	}
}