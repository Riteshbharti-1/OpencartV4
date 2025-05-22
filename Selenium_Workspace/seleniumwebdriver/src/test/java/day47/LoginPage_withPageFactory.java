package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_withPageFactory {
	
	WebDriver driver;
	
	//constructor
	LoginPage_withPageFactory(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators

	//@FindBy(how=How.XPATH, using="//input[@placeholder='Username']")  //can also use in this way
	@FindBy(xpath=("//input[@placeholder='Username']"))
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	
	//Action methods
	public void setUserName(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void hitLoginBtn()
	{
		btn_login.click();
	}
}
