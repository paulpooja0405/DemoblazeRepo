package testingBasic;

import org.testng.annotations.Test;

public class Example3 {
	
	@Test( enabled = false)//skip from execution
	public void xyz()      
	{
		System.out.println("xyz method");
	}
	
	@Test(priority = -1)
	public void lop()
	{
		System.out.println("lop Method");
	}
	
	@Test
	public void abc()
	{
		System.out.println("abc method");
	}


}
