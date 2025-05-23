package day28;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Set<String> wind_ids = driver.getWindowHandles();
		
		//Approach-1
		for(String wind_id:wind_ids)
		{
			
			String title = driver.switchTo().window(wind_id).getTitle();
			System.out.println(title);
			
			if(title.equals("OrangeHRM") || title.equals("Some other title"))
			{
				driver.close();
			}
		}
	}

}
