package com.app.TestNG.Extentreports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {
	
	@Test(testName= "TestWiki")
	public void method1() throws InterruptedException
	{
       driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		Thread.sleep(1000);
		
		String Expectedtitle = "Create account wiki";
		
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(actualtitle, Expectedtitle,"The title of the page is not valid");
		// Record the status of the test in the extent report
		extentTest.pass("Assertion is passed");
	}
	
	@Test(testName= "Testfacebook")
	public void method2()
	{
       driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("admin@gmail.com");
		extentTest.info("Entered valid URL");
	}
	
	@Test(testName= "Testrediff")
	public void method3()
	{
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		extentTest.info("Navigated to the URL");
	    driver.findElement(By.id("login1")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
	}

}
