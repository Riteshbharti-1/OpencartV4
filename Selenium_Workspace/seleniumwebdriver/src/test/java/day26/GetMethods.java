package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
//get methods - we can access these methods through webdriver instance		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());   //OrangeHRM
		
		//getCurrentUrl()
		
		
//		String current_url = driver.getCurrentUrl();
//		System.out.println(current_url);
		
		//getPageSource()
		
//		String page_source = driver.getPageSource();
//		System.out.println(page_source);
		
		Thread.sleep(5000);
		
		//getWindowHandle() - returns ID of the single Browser window
		String windid = driver.getWindowHandle();
		System.out.println("window id is: "+windid);
		
		//getWindowHandles() - returns ID of the multiple Browser window
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> wind_ids = driver.getWindowHandles();
		System.out.println(wind_ids); //[6A7ECE071DF284372485B0A38EA9FCD5, F79164AEFFF77BD11A447F87208576D1]
		
		driver.quit();
		
	
		
		
	}
}
