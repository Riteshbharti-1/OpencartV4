package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM_Test {

	WebDriver driver;
	
	@Test(priority = 1)
	void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 2)
	void testLogo() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		System.out.println("Logo is displayed :"+logo.isDisplayed());
	}
	
	@Test(priority = 3)
	void login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority = 4)
	void logout()
	{
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}
	
	@Test(priority = 5)
	void close()
	{
		driver.close();
	}
	
  }
