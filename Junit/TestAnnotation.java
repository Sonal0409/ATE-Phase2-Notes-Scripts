package com.app.junitDemo;

import org.junit.jupiter.api.Test;

public class TestAnnotation {
	
	
	// Chnage the Java Library in the project if you are not getting option to run junit test cases
	// rightclick on the project > build path >Configure build Path > Libraries > Select JRE system Library> Click on remove button
	// Click on Add library >  Select JRE system Library > click on first radio button > from drop down
	// select the java version that is on your machine > save the changes
	
	@Test  // execute the below test
	public void Method1()  // unit Test method
	{
		System.out.println("Hello Junit");
	}

}
