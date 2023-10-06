package com.app.TestNG.DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterDemo {
	
	WebDriver driver = null;
	
	// this method is expecting an input from the user
	
	
	@BeforeTest
	public void openbrowser()
	{
	
			driver = new ChromeDriver();
	
		
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?returnto=Wikipedia%3ASign+up&title=Special:UserLogin&centralAuthAutologinTried=1&centralAuthError=Not+centrally+logged+in");
	}
	
	@Parameters({"username","password" })
	@Test
	public void login(String username, String password) throws InterruptedException
	{
		driver.findElement(By.id("wpName1")).sendKeys(username);
		driver.findElement(By.id("wpPassword1")).sendKeys(password);
		Thread.sleep(1000);
	}
	
@AfterTest
public void closeBrowser()
{
	driver.close();
}
	
}
