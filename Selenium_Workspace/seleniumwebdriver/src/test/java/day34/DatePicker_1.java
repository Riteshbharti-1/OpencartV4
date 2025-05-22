package day34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker_1 {
	
	//user defined method for converting month from String to Month
	
	static Month convertMonth(String month) {
		HashMap<String, Month> monthMap=new HashMap<String, Month>();
		
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vmonth=monthMap.get(month);
		
		if(vmonth==null)
		{
			System.out.println("Invalid month");
		}
		return vmonth;
		
		
		
	}
	

	
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		
		//Input DOB
		String requiredYear="2018";
		String requiredmonth="November";
		String requireddate="01";
		
		driver.findElement(By.xpath("//*[@id='txtDate']")).click();
		
		//Select year
		WebElement yearDropDown = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
		Select select_year=new Select(yearDropDown);
		select_year.selectByVisibleText(requiredYear);
		
	}

}
