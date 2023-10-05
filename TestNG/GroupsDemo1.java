package TestScenario1;

import org.testng.annotations.Test;

public class Sample1 {
	
	
	@Test(priority='1',groups= {"smoke","functional","regression"})
	public void openapp()
	{
		System.out.println("Open the browser and open URL");
	}
	
	@Test(priority='2',groups= {"functional"})
	public void loginSample1()
	{
		System.out.println("login successfully");
	}
	
	@Test(priority='3',groups= {"regression"})
	public void loginwithInvaliddata()
	{
		System.out.println("login failed");
	}
	
	@Test(priority='4',groups= {"regression"})
	public void loginwithWrongpassword()
	{
		System.out.println("Wring password");
	}

}
