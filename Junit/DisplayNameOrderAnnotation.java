package com.app.junitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// for @Order annotation /sequnece to be implemented by Junit , we have to also use @TestMethodOrder

/* MethodOrderer that sorts methods based on the @Orderannotation. 
 * 
 * 
Any methods that are assigned the same order value will be sorted arbitrarily adjacent to each other. 

Any methods not annotated with @Order will be assigned the default order value which will 
effectively cause them to appear at the end of the sorted list, 
unless certain methods are assignedan explicit order value greater than the default order value.
 Any methodsassigned an explicit order value greater than the default order value willappear 
 after non-annotated methods in the sorted list */


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
// @TestMethodOrder(MethodOrderer.Random.class)  // run test randomly and not in any order
public class DisplayNameOrderAnnotation {
	
	// @Test(priority='1',name="displaynameofTest")

	@Order(4)
	@DisplayName("4. SignIn button")
	@Test
	public void method1()
	{
		System.out.println("testing sign In button");
	}
	
	@Order(1)
	@DisplayName("1. Unsername field")
	@Test
	public void method2()
	{
		System.out.println("Testing username");
	}
	@Order(2)
	@DisplayName("2. Password field")
	@Test
	public void method3()
	{
		System.out.println("Testing password field");
	}
	@Order(3)
	@DisplayName("3. forget password field")
	@Test
	public void method4()
	{
		System.out.println("testing forget password field");
	}
	
	
	
	
}
