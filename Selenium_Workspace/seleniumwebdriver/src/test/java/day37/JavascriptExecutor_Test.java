
package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_Test {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', 'Ramson Oslo')", name);
		
		WebElement femaleRadibttn = driver.findElement(By.xpath("//input[@id='female']"));
		js.executeScript("arguments[0].click()", femaleRadibttn);
		
		WebElement chkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
		WebElement chkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[9]"));
		
		js.executeScript("arguments[0].click()", chkbox);
		js.executeScript("arguments[0].click()", chkbox1);
		
		
	}

}
