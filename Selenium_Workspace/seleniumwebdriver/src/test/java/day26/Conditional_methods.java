package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_methods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.nopcommerce.com/register");
		
//conditional methods - access these commands through WebElement : returns boolean value(true/false)
		//isDisplayed() , isEnabled(), isSelected()	
		
		WebElement logo = driver.findElement(By.xpath("//*[@alt='nopCommerce demo store']"));
		System.out.println("Display status of logo :" +logo.isDisplayed());
		
		//or
		boolean Logo_status=driver.findElement(By.xpath("//*[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Display status :"+Logo_status);
		
		boolean search_field=driver.findElement(By.xpath("//*[@id='FirstName']")).isEnabled();
		System.out.println("Status of the search filed :"+ search_field);
		
		WebElement Maleradio_bttn = driver.findElement(By.xpath("//*[@id='gender-male']"));
		System.out.println("Male radio button is selected : "+Maleradio_bttn.isSelected());
		
		driver.findElement(By.xpath("//*[@id='gender-female']")).click();
		WebElement Femaleradio_bttn = driver.findElement(By.xpath("//*[@id='gender-female']"));
		System.out.println("Female radio button is selected : "+Femaleradio_bttn.isSelected());

		driver.quit();
	}
}
