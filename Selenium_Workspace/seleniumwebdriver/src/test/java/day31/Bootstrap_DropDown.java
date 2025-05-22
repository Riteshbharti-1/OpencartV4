package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_DropDown {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//*[@class='multiselect dropdown-toggle btn btn-default']")).click();
		
		//Select single option from dropDown
//		driver.findElement(By.xpath("(//*[@value='Java'])[2]")).click();
		
		
		//Capture all the options and find out the size
		List<WebElement> allopt = driver.findElements(By.xpath("//*[@class='checkbox']"));
		System.out.println(allopt.size());

//		for(WebElement opt:allopt)
//		{
//			System.out.println(opt.getText());
//		}
//		
		//Select multiple options
		
		for(WebElement opt:allopt)
		{
			String option = opt.getText();
			if(option.equals("Java") || option.equals("Python") || option.equals("Angular") || option.equals("C#"));
			opt.click();
		}
	}

}
