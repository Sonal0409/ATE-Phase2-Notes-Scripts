package com.app.TestNGScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Paralleltest {
	
	
	

	
	
	@Test
	public void wikiPage() throws InterruptedException
	{
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		Thread.sleep(1000);
		driver.close();
	}
	
	@Test
	public void wikiPage2() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		Thread.sleep(1000);
		driver.close();
	}

	@Test
	public void ninjaPage() throws InterruptedException
	{
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		Thread.sleep(1000);
		driver.close();
	}
	
	@Test
	public void ninjaPage2() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		Thread.sleep(1000);
		driver.close();
	}
	

}









