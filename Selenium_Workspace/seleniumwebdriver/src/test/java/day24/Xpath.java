package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com");
		
		//Xpath with single attribute
//		driver.findElement(By.xpath("//img[@alt='Picture for category Electronics']")).click();
		
		//Xpath with multiple attribute
//		driver.findElement(By.xpath("//*[@type='text'][@id='small-searchterms']")).sendKeys("Samsung galaxy ultra");

		
		//xpath using 'and' - 'or' operator
//		driver.findElement(By.xpath("//*[@type='text' and @id='small-searchterms']")).sendKeys("Alexa");
//		driver.findElement(By.xpath("//*[@type='submit' or @class='button-1 search-box-button']")).click();

		//Xpath with inner text
//		driver.findElement(By.xpath("//*[@type='text' and @id='small-searchterms']")).sendKeys("Alexa");
//		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
	
		//xpath using contains ()
//		driver.findElement(By.xpath("//*[contains(@placeholder, 'Sear')]")).sendKeys("Macbook");
		
		
		//xpath using start-with 
		driver.findElement(By.xpath("//*[starts-with(@placeholder, 'Sear')]")).sendKeys("Macbook");
	
	
	}

}
