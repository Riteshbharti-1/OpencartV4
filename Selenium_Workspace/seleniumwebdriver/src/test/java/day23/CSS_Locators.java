package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		//CSS selector- tag id Note: tag is optional
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Iphone 16");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Iphone 17");
		
		//tag class  -  tag.classname
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Apple");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Apple");
	
	
		//tag attribute - tag[attribute="value"]
//		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Samsung Galaxy S24");
//		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Samsung Galaxy S24");
	
		
		//tag class attribute - tag.classname_Value[attribute='value']
//		driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("Samsung S23 Ultra");
		driver.findElement(By.cssSelector(".search-box-text[placeholder='Search store']")).sendKeys("Samsung S23 Ultra");
		
		
	
	
	}
	

}
