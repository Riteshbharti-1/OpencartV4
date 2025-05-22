package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/effect");
		
		
		WebElement contribute = driver.findElement(By.xpath("//*[text()='Contribute']"));
		WebElement style_guide = driver.findElement(By.xpath("//*[text()='Style Guides']"));
		
		Actions act=new Actions(driver);
		
		//Mouse hover
		//act.moveToElement(contribute).moveToElement(style_guide).click().build().perform();
		act.moveToElement(contribute).moveToElement(style_guide).click().perform();
		
		
	}

}
