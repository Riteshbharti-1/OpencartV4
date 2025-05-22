package day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomELements {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://books-pwakit.appspot.com");
        
        //driver.findElement(By.xpath("//input[@id='input']")).sendKeys("Hello"); //NoSuchElementException
        

        SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
        Thread.sleep(2000);
        shadow.findElement(By.cssSelector("#input")).sendKeys("Hello-Welcome to AI Automation");
		
	}

}
