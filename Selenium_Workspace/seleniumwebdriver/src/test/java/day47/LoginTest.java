package day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	LoginPage_withPageFactory lp;
	
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test
	void logintest()
	{
		lp=new LoginPage_withPageFactory(driver);
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.hitLoginBtn();
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
