package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement right_click = driver.findElement(By.xpath("//*[text()='right click me']"));
		
		Actions act=new Actions(driver);
		act.contextClick(right_click).build().perform();
		
		//click on copy
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		//close alert (by capturing the alert modal text
		String alert_text = driver.switchTo().alert().getText();
		System.out.println(alert_text);
		driver.switchTo().alert().accept();
		
			
		
	}
	
	

}
