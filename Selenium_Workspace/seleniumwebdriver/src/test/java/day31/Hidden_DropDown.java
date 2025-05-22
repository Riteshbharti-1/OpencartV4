package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_DropDown {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();  //PIP Tab
		driver.findElement(By.xpath("(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]")).click();  //Job title dropDown
		
		
		
	}

}
