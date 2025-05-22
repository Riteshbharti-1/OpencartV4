package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestNG_Dataproviders {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Test(dataProvider = "dp")
	void testLogin(String username, String pass) throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		if(logo==true)
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@DataProvider(name="dp", indices= {0,1})  //based on indices choose test data will be executed
	Object loginData()
	{
		Object data[][]= {
				
				{"Admin", "admin123"}, //0th
				{"Admin", "admin123"}, //1st
				{"Admin", "admin123"}, //2nd
				{"Admin", "admin123"}, //3rd
				{"Admin", "admin123"}, //4th
				
		};
		return data;
	}
}
