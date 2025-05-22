package day38;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {
	
	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
//to remove "Chrome is being controlled by automated software"		
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://expired.badssl.com");
		
		System.out.println("title of the page is : "+driver.getTitle());
		
		
	}

}
