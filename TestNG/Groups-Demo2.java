package TestScenario1;

import org.testng.annotations.Test;

public class Sample2 {
	
	
	@Test(priority='1',groups= {"smoke","functional","regression"})
	public void opentheAccountPage()
	{
		System.out.println("Open the browser and open Accountspage");
	}
	
	@Test(priority='2',groups= {"functional"})
	public void login()
	{
		System.out.println("login app");
	}
	@Test(priority='3',groups= {"functional"})
	public void Accounts()
	{
		System.out.println("check the accountpage");
	}
	
	@Test(priority='4',groups= {"functional","regression"})
	public void createAccount()
	{
		System.out.println("create an account");
	}
	
	@Test(priority='5',groups= {"smoke","regression","functional"})
	
	public void Logout()
	{
		System.out.println("Logout");
	}

}
