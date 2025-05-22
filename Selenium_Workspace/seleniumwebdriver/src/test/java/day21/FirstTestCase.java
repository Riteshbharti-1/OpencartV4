package day21;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class FirstTestCase {

	public static void main(String[] args) 
	{
		//1.Launch browser (Chrome)
		
//		ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		
		//2. Open URl
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		//3. Validate title should be - 
		
		@Nullable
		String actual_title = driver.getTitle();
		System.out.println("Title of the page is: "+actual_title);
		if(actual_title.equals("OpenCart - Demo"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
		driver.close();

	}

}
