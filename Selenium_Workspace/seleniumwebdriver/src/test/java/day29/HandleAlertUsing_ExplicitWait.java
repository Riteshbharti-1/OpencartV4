package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//Handle alert without using switchTo().alert() -->using Explicit wait
public class HandleAlertUsing_ExplicitWait {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
		Alert my_alert = mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(my_alert.getText());
		my_alert.accept();
		
	}

}
