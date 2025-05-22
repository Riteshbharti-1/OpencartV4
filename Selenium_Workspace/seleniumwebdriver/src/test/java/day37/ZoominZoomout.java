package day37;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoominZoomout {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='30%'");  //set zoom level at 50%
		js.executeScript("document.body.style.zoom='80%'");  //set zoom level at 50%
		
	}

}
