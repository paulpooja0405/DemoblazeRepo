package annotationConcepts;

import org.testng.annotations.*;
public class Example1 {
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after Method");
	}
	@Test()
	public void abc()
	{
		System.out.println("abc Method");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before Class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after Class");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before Test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("after Test");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before Suite");
	}
	
	

}



