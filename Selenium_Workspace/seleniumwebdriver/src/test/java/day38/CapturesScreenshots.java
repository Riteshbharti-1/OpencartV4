package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturesScreenshots {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com");
		
	/*	
		//1. full page screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destinationFile=new File(System.getProperty("user.dir")+"\\screenshot\\nopHome.png");
		sourceFile.renameTo(destinationFile);
		
	*/
		
		
		//2.capture the SS of the specific section 
		WebElement featuredProducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourcefile = featuredProducts.getScreenshotAs(OutputType.FILE);
		File destinationfile=new File(System.getProperty("user.dir")+"\\screenshot\\featuredproducts.png");
		sourcefile.renameTo(destinationfile);
		
		//3.capture the SS of the specific WebElement
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File source_file = logo.getScreenshotAs(OutputType.FILE);
		File destination_file=new File(System.getProperty("user.dir")+"\\screenshot\\logoNop.png");
		source_file.renameTo(destination_file);
		
	}

}
