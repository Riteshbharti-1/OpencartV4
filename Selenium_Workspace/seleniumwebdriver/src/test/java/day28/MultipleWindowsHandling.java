package day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandling {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/FluentWait.html");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windids = driver.getWindowHandles();
		System.out.println(windids);
		
		for(String windid:windids)
		{
			String title = driver.switchTo().window(windid).getTitle();
			System.out.println(title);
			
			if(title.equals("OrangeHRM") || title.equals("FluentWait") || title.equals("ABC"))
			{
				driver.close();
			}
		}
		
	}

}
