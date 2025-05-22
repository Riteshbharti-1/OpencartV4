package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/* 1.Login-->@BeforeMethod
   2.Search-->@Test
   3.Logout-->@AfterMethod
   4.Login-->@BeforeMethod
   5.advancedSearch-->@Test
   6.Logout-->@AfterMethod
 
 */

public class TestNG_Annotations {
	
	@BeforeMethod
	void login()
	{
		System.out.println("This is login");
	}
	
	@Test(priority = 1)
	void search()
	{
		System.out.println("This is search");
	}
	
	
	@Test(priority = 2)
	void advancedSearch()
	{
		System.out.println("This is advancedSearch");
	}
	
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout");
	}

}
