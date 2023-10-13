package com.app.junitDemo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedtestDemo {
	
	// we will not use @Test annotation
	
	@RepeatedTest(3)
	// execute this test 3 times
	@DisplayName("repeatedtests")
	public void repeatmessage()
	{
		System.out.println("We are learning Junit");
	}

	@Test
	public void AssumptionsDemo()
	{
		// i want to run the test case sonly and only if my DB server is Up and running
		
		boolean isDBServerUp = true;
		
		Assumptions.assumeTrue(isDBServerUp,"server is not Up");
		
		System.out.println("Create tables and inster data");
		
	}
	
	
	
	
}
