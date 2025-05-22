package day36;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabAndWindow {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://opencart.com");
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[normalize-space()='Features']")).click();

		//driver.close();
	}

}
