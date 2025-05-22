package day44;

import org.testng.annotations.Test;

public class SignupTests {
	
	@Test(priority = 1, groups = {"regression"})
	void signupByGmail()
	{
		System.out.println("this is signup using Gmail");
	}

	@Test(priority = 2, groups = {"regression"})
	void signupByFb()
	{
		System.out.println("this is signup using FB");
	}

	@Test(priority = 3, groups = {"regression"})
	void signupByTwitter()
	{
		System.out.println("this is signup using Twitter");
	}
}