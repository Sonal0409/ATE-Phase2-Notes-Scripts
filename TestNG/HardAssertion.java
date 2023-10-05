package com.app.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionsDemo {
	
	
	// Assertions are a way to validate if your expected output is matching the actual output
	// hard Assertion :
	// When the you check if expected output is matching the actual output ->your testcase continues to run
	//expected output is not matching the actual output, test case stops
	
	
WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@Test(priority='1')
	public void GetTitle()   // Called as a Test Method
	{
		
		String expectedtitle = "Your Store";
		String actualtitle = driver.getTitle();
		
		// we are checking if expected is equal to actual
		// if they are smae.. test case continues
		// if they are not same, test cases fails with assertion message
		// and Assert exception
	   Assert.assertEquals(actualtitle, expectedtitle, "The title donot match");
	   
	   // assertTrue();
	   
	boolean searchbox =  driver.findElement(By.name("search")).isDisplayed();
	
	// if searchbox is having true, then assert condition passes
	//if searchbox is having false, then assert condition fails
	
	searchbox = false;
	
	Assert.assertTrue(searchbox);
	   
	driver.findElement(By.name("search")).sendKeys("mac");
	
	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
	}
	

}















