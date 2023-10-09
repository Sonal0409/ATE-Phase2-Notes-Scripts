
package com.app.SeleniumGrisDemos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GRIDStandaloneDemo {

	
	WebDriver driver;
	
	@Test
	public void GridDemo1() throws MalformedURLException
	{
		
		// and send your desired capapbilties to the hub to start a session on the node
		
		ChromeOptions cap = new ChromeOptions();
		
		// this RemoteWebDriver class will connect webdriver to HUb router
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
	}
	
	
	
}
