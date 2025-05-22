package day27;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_wait {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		
		//Fluent wait declaration
		
		Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username = mywait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//*[@placeholder='Username']"));
		     }
		});
		
		username.sendKeys("Admin");
		
//		WebElement username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Username']")));
//		username.sendKeys("Admin");
		
		WebElement password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='Password']")));
		password.sendKeys("admin123");
		
		WebElement login_bttn = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit']")));
		
		login_bttn.click();
		
		//driver.close();
		
	}

}
