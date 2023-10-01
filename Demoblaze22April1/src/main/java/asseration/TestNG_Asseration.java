package asseration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Asseration {
	String  city;
	@Test
	public void equals()
	{
		int a = 10;
		int b = 20;
		int c=a+b;
		System.out.println(c);
		Assert.assertEquals(c, 30);
	}
	
	@Test
	public void notequals()
	{
		int a = 10;
		int b = 20;
		int c=a+b;
		System.out.println(c);
		Assert.assertNotEquals(c, 60);
	}
	
	@Test
	public void true1()
	{
		boolean a = 30>20;
		System.out.println(a);
		Assert.assertTrue(a);
	}
	
	@Test
	public void false1()
	{
		boolean a = 30>50;
		System.out.println(a);
		Assert.assertFalse(a);
	}
	
	@Test
	public void null1()
	{
		Assert.assertNull(city);
	}
	
	@Test
	public void notnull1()
	{
		String city = "MUMBAI";
		Assert.assertNotNull(city);
	}



}
