package day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_Commands {
	
	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");  //--> accepts URL in string format only
		
		//---> accepts URL in the string & URL object format
//		URL myurl=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.navigate().to(myurl);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.quit();
	}

}
