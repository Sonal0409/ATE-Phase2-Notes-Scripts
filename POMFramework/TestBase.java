package com.ninja.qa.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	
	public static WebDriver driver;
	
	public static void openBrowser(String browser)
	{
		if(browser == "Chrome")
		{
		driver = new ChromeDriver();
		}
		
		if(browser == "firefox")
		{
		driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");	
	}

}
