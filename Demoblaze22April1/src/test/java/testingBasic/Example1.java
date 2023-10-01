package testingBasic;

import org.testng.annotations.Test;

public class Example1 {
	
	@Test
	public void xyz()      //alphabetic order o/p comming
	{
		System.out.println("xyz method");
	}
	
	@Test(invocationCount = 6,priority = -1) //count 
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
