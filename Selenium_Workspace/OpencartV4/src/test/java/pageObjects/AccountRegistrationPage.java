package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkAgree;

	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setFirstname(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastname(String Lname)
	{
		txtLastname.sendKeys(Lname);
	}
	
	public void setEmail(String Email)
	{
		txtEmail.sendKeys(Email);
	}
	
	public void setTelephone(String Telephone)
	{
		txtTelephone.sendKeys(Telephone);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String ConfirmPwd)
	{
		txtConfirmPassword.sendKeys(ConfirmPwd);
	}
	
	public void checkPrivacy()
	{
		chkAgree.click();
	}
	

	public void clickOnContinue()
	{
		btnContinue.click();
	}
	
	public String getconfirmationMsg()
	{
		try {
			return (msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
		
	}

}

	
	