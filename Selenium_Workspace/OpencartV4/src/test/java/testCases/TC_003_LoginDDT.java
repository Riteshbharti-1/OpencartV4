package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass{
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups="Datadriven")
	public void verify_loginDDT(String email, String pwd, String exp)
	{
	
		logger.info("****Starting TC_003_LoginDDT ****");
		
		try
		{
		//Home page
		HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		hp.clicklogin();
		
	//Login page
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickLogin();
			
	//My account page
		MyAccountPage mp=new MyAccountPage(driver);
		boolean targetpage = mp.isMyAccountPageExist();	
		
		
	/*Data is valid---login success ---  test passed--logout
					  login un-success--- test failed
		
	Data is invalid=---login success---- test failed---logout
					   login un-success---test passed
					  
		
	*/	
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetpage==true)
			{
				mp.clicklogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertFalse(false);
			}
		}	
			
	
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				mp.clicklogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertFalse(true);
			}
		}
	}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("****finished TC_003_LoginDDT ****");
	}
}
