package com.app.junitDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAfterAllAnnoatation {
	
	static JavaOperations obj ;
	
	@BeforeAll
	public void init()
	{
		System.out.println("Start the DB");
		obj = new JavaOperations();
		 System.out.println("Initalization done..");
	}
	
	@AfterAll
	public void teardown()
	{
		System.out.println("stop the DB");
	}
	
	
	@Test
	public void method1()
	{
		System.out.println("Executing method 1 of code class");
	}
	
	@Test
	public void method2()
	{
		System.out.println("Executing method 2 of code class");
	}

}
