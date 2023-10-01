package testingBasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example2 {
	
	@Test(priority = 0)
	public void login()
	{
		System.out.println("login method");
		Assert.fail();         // use for fail test case
	}
	@Test(priority = 1)     
	public void home()
	{
		System.out.println("home method");
	}
	@Test(priority = 2,dependsOnMethods = {"login"})  //dependent tastecases
	public void contact()
	{
		System.out.println("contact method");
	}

}
