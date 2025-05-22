package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_DatePicker {
	
	
	//Select future date
	static void futureDate(WebDriver driver, String month, String year, String date)
	{
		while(true)
		{
			String current_month = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
			String current_year = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
			
			if(current_month.equals(month) && current_year.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next arrow click
		}
				
		//Select date
				
		List<WebElement> alldays = driver.findElements(By.xpath("//tbody//td[@data-handler='selectDay']"));
				
		for(WebElement day:alldays)
			
		{
			if(day.getText().equals(date))
			{
				day.click();
				break;
			}
		}
		
	}
	

	//Select past date
	static void pastDate(WebDriver driver, String month, String year, String date)
	{
		while(true)
		{
			String current_month = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
			String current_year = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
			
			if(current_month.equals(month) && current_year.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();  //preview arrow click
		}
		
		//Select date
		
		List<WebElement> alldays = driver.findElements(By.xpath("//tbody//td[@data-handler='selectDay']"));
		
		for(WebElement day:alldays)
			
		{
			if(day.getText().equals(date))
			{
				day.click();
				break;
			}
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker");
		
		//switch to iframe
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);

		String month="August";
		String year="2024";
		String date="27";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();  //open date picker
		
		//futureDate(driver, month, year, date);
		pastDate(driver, month, year, date);
		
	}

}
