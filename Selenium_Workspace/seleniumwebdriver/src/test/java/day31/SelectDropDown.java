package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://testautomationpractice.blogspot.com");
	
	WebElement dropdown_country = driver.findElement(By.xpath("//*[@id='country']"));
	
	//Select class--> selectByVisibleText(WebElement)
	Select country=new Select(dropdown_country);
	country.selectByVisibleText("India");
	
	Thread.sleep(3000);
	
	//selectByValue("")
	country.selectByValue("japan");
	
	Thread.sleep(3000);
	
	//Select class--> selectByIndex()--> we can start counting manually from options,so index of one will be 0, 1, 2, ....
	country.selectByIndex(5);
	
	//Capture the options from the drop-down
	List<WebElement> allOpt = country.getOptions();
	System.out.println("No.of options in a drop-down: "+allOpt.size());
	
	
	//Printing the WebElements (options)
//	for(int i=0; i<allOpt.size();i++)
//	{
//		System.out.println(allOpt.get(i).getText());
//	}

	//using enhance for loop
	
	for(WebElement opt:allOpt)
	{
		System.out.println(opt.getText());
	}
	
	}

}
