package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");
		WebElement field1 = driver.findElement(By.xpath("//*[@id='field1']"));
		WebElement field2 = driver.findElement(By.xpath("//*[@id='field2']"));
		WebElement button=driver.findElement(By.xpath("//*[@ondblclick='myFunction()']"));
		
		field1.clear();
		field1.sendKeys("Welcome");
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();
		
		//Validation of the copied text
//		String copied_txt=field2.getText();  //getText method always captured inner text only 
		String copied_txt=field2.getAttribute("value");
		
		System.out.println("Captured text is: "+copied_txt); 
		
		if(copied_txt.equals("Welcome"))
		{
			System.out.println("Text copied successfully");
		}
		else
		{
			System.out.println("Text not copied properly");
		}
		
	}
}
