package com.app.junitDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

// write @Disabled annotation at class level
// All the test methods in this class will be skipped or not executed
@Disabled("Functionalty is not working, ignoring the tests")
public class DisabledTests {
	
	@Test
	public void method1()
	{
		System.out.println("Executing method 1 of code class");
	}
	
	@Test
    @Disabled
	public void method2()
	{
		System.out.println("Executing method 2 of code class");
	}
	
	@Test
	 @Disabled
	public void method3()
	{
		System.out.println("Executing method 3 of code class");
	}
	
	@Test
	public void method4()
	{
		System.out.println("Executing method 4 of code class");
	}


}
