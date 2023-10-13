package com.app.junitDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsJunitDemo {
	
	@Test
	public void testAssertions()
	{
		
		String expected = new String("abc");
		String actual = new String("abc");
		String str3 = "junit";
		String str4 = null;
		String s1 = "sonal";
		String s2 = "sonal";
		int val1 = 20;
		int val2 = 30; 
		
		String [] array1 = {"one","two","three"};
		String [] array2 = {"one","two","three"};
		
    //Assertions.assertEquals(expected, actual);
	
	//	Assertions.assertTrue(val1<val2);  // true
	//	Assertions.assertNotNull(str3); // here the expected input should not be null
	//	Assertions.assertNull(str4); // here the expected input should  be null
    //	Assertions.assertSame(str3, str4); // check if 2 objects are same or not
	//	Assertions.assertNotSame(s1, s2); // check if 2 objects should be same
		
		Assertions.assertArrayEquals(array1,array2);
	}

}











