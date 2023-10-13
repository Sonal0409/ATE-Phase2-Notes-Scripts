package com.app.junitDemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfterEachAnnoatation {
	
	// @BeforeEach & @AfterEach are similar to TestNG @BeforeMethod @AfterMethod
	
	JavaOperations obj;
	
	@BeforeEach  // execute the init() method before each test method
	public void init() {   // pre condition method
		System.out.println("Start Db connection");
		 obj = new JavaOperations();
		 System.out.println("Initalization done..");
	}
	
	
	@AfterEach // execute teardown() method after each test method
	public void teardown()  // post condition method
	{
		System.out.println("close DB connection");
	}
	
	@Test
	public void test1()
	{
		// create an object of a class and then execute the code
		System.out.println("Execute the test case using methods of ... JavaOperations");
		
	}
	
	@Test
	public void test2()
	{
		// create an object of a class and then execute the code
		System.out.println("Execute the test case using methods of ... JavaOperations");
		
	}

}
