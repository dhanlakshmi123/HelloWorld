package com.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		
		HelloPrint hello2 = new HelloPrint();
		
		assertSame("Hello World",hello2.HelloPrint());
	} 

}
