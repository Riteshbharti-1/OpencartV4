package day36;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com");
		
		
		WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(registerLink).keyUp(Keys.CONTROL).perform();
		
		

		//driver.close();
	}

}
