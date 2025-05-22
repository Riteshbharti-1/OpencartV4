package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sleep_Command {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}

}
