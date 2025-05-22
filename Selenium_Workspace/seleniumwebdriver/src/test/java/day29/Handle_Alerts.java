package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		Thread.sleep(4000);
		
		//Simple Alert
		driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
		Alert simple_alert = driver.switchTo().alert();
		System.out.println(simple_alert.getText());
		simple_alert.accept();
		
		// Confirmational Alert
		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
		Alert Confirmational_alert = driver.switchTo().alert();
		//Confirmational_alert.accept();
		Confirmational_alert.dismiss();
		
		//Prompt Alert
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		Alert Prompt_alert = driver.switchTo().alert();
		Prompt_alert.sendKeys("Prompt alert");
		Prompt_alert.accept();
		
		Thread.sleep(4000);
		
		WebElement Result = driver.findElement(By.xpath("//*[@id='result']"));
		System.out.println(Result.getText());
				
		if(Result.equals(Result))
		{
			driver.close();
		}
		
	}

}
