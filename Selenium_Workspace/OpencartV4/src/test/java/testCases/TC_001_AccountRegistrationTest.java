package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	
	@Test(groups={"Regression", "Master"})
	public void verify_account_registration()
	{
		
		logger.info("*** Starting TC_001_AccountRegistrationTest***");
		
		try {
		HomePage hp=new HomePage(driver);
		logger.info("*** Clicked on My account Link ***");
		hp.clickMyaccount();
		logger.info("*** Clicked on register Link ***");
		hp.clickRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		logger.info("*** Providing customer details ***");
		regpage.setFirstname(randomString().toUpperCase());
		regpage.setLastname(randomString().toUpperCase());
		regpage.setEmail(randomString()+"@fextemp.com");
		regpage.setTelephone(randomNumber());
		
		String password=randomAlphaNumberic(); //If we have confirm pass field then to avoid random password in confirm field , we captured it first then passed it as a variable
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		regpage.checkPrivacy();
		regpage.clickOnContinue();
		
		logger.info("*** Validating expected message.. ***");
		String confMsg=regpage.getconfirmationMsg();
		
		Assert.assertEquals(confMsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			logger.error("Test failed...");
			logger.debug("Debug logs...");
			Assert.fail();
		}
		
		logger.info("*** Finished TC_001_AccountRegistrationTest***");
	}
	
}
