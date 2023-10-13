package com.app.junitDemo;

import java.util.Collection;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class Dynamictests2 {
	
	@TestFactory
	public Stream<DynamicTest> dynamicTestsforPalindrome()  // here DynamicTest is class generating testcase at runtime
	{
		return Stream.of("pop","mom","dad","madam").map(inputText ->
		
		DynamicTest.dynamicTest(inputText,
			
				() -> Assertions.assertTrue(Myutils.isPalindrome(inputText)))	
				
				
				);
		
		
	}

}
