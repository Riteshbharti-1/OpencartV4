package day44;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority = 1, groups = {"sanity"})
	void loginByGmail()
	{
		System.out.println("this is gmail login");
	}

	@Test(priority = 2, groups = {"sanity"})
	void loginByFb()
	{
		System.out.println("this is FB login");
	}

	@Test(priority = 3, groups = {"sanity"})
	void loginByTwitter()
	{
		System.out.println("this is Twitter login");
	}
}