
package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1.scrolling by pixel number
		
		js.executeScript("window.scrollBy(0, 10000)");  //9592
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//2. Scroll page till the element is visible
		
		WebElement top100LargestCountries = driver.findElement(By.xpath("//a[text()='Top 100 largest countries by area']"));
		
		js.executeScript("arguments[0].scrollIntoView();", top100LargestCountries);
		js.executeScript("arguments[0].click();", top100LargestCountries);
		
		//3. Scroll page till the end of the page
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));  //4364
		
		//3. Scrolling up to initial position
		
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));  //0
	}

}
