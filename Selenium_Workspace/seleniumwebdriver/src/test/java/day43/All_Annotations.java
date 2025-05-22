package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_Annotations {
	
	@BeforeSuite
	void bs()
	{
		System.out.println("this is before suite");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("this is after suite");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("this is before test");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("this is after test");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("this is before class");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("this is after class");
	}
	
	@BeforeMethod
	void bm()
	{
		System.out.println("this is before method");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("this is after method");
	}

	@Test
	void tm1()
	{
		System.out.println("this is tm1");
	}
	@Test
	void tm2()
	{
		System.out.println("this is tm2");
	}
}
