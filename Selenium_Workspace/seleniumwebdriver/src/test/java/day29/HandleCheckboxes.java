package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com");
		
	//1. select specific checkbox	
		//driver.findElement(By.xpath("//*[@id='sunday']")).click();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"));
		
//		for(WebElement checkbox:checkboxes)
//		{
//			checkbox.click();
//		}
		
	//2.Select last 3 checkboxes
		//Formula--> Total no.of checkboxes - how many checkboxes want to select = starting index
		//7-3=4
//		for(int i=4; i<checkboxes.size(); i++)
//		{
//			checkboxes.get(i).click();
//		}
		
		
	//3. Select  first 3 checkboxes
		for(int i=0; i<3; i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(4000);
		
	//4. unselect checkboxes if they are selected
		for(int i=0; i<checkboxes.size(); i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
	}

}
