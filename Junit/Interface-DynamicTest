package com.app.junitDemo;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.Assertions;

public class DynamicTests {
	// Assited practice - 5
	//@Test annotation the tests are static in nature, that means we define them at compile time
	// before execution the entire test is available in front of us
	
	// Junit brings to you a concept called as Dynamic tests, in which the tests will be genrated at runtime
	// Advantage using this you are writing less code and you can write many dynamic tests at one go, 
	// java will automatically create the test methods for you at run time
	// A dynamic test is a test which is generated during runtime using an annotation @TestFactory
	// Dynamic test cannot be private or static, they will be public
	// @Test annotation will mostly not return anything
	// @TestFactory annotation will return Single Dynamic Node, or a Stream,Collections, Arrays of Dynamic Nodes instance
	// Iterator, iterable
	// otheriwse it will throw an Junit exception
	// DynamicNode ==> DynamicContainer + DynamicTest
	// Interface of Junit which is DynamicTest
	// The Dynamic Test that you write will have 2 parts:
	// 1. Display Name of the dynamic test
	// 2. Executable -> piece of code that get executed as part of dynamic test, it cannot be null otherwise you will get error
	// for dynamic tests we will not use any lifeCycle annotation
	
	
	@TestFactory
	public Collection<DynamicTest> dynamicTests()  // here DynamicTest is class generating testcase at runtime
	{
		return Arrays.asList(
				DynamicTest.dynamicTest("Simple Test1", () -> Assertions.assertTrue(true)),
				DynamicTest.dynamicTest("Simple Test2", () -> Assertions.assertTrue(true)),
				DynamicTest.dynamicTest("Exception handling", () -> {throw new Exception("Exception dynamicTest");}),
				DynamicTest.dynamicTest("Simple Test2", () -> Assertions.assertTrue(true))
				
				);
	}
	
	
	
	
	
	
	
	
	
	
	
}
