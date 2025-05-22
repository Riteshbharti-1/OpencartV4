package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{
	
	
	@Test(groups={"Sanity", "Master"})
	public void verify_login()
	{
		logger.info("***Starting TC_002_LoginTest***");
		
		try
		{
		//Home page
		HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		hp.clicklogin();
		
		//Login page
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(prop.getProperty("email"));
		lp.setPassword(prop.getProperty("password"));
		lp.clickLogin();
		
		//My account page
		MyAccountPage mp=new MyAccountPage(driver);
		boolean targetpage = mp.isMyAccountPageExist();
		
		//Assert.assertEquals(targetpage, true);
		Assert.assertTrue(targetpage);
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		logger.info("***Finished TC_002_LoginTest***");
	}

}
