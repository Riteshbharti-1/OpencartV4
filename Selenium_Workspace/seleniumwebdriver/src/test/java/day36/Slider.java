package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act=new Actions(driver);
		
		//Min slider
		WebElement min_slider = driver.findElement(By.xpath("//span[@tabindex='0'] [@style='left: 0%;']"));
		System.out.println("Default Location of the min slider :"+min_slider.getLocation());  //Location of the min slider :(59, 250)
		System.out.println("Location of the x int :"+min_slider.getLocation().getX());  //Location of the x int :59
		System.out.println("Location of the y int :"+min_slider.getLocation().getY());  //Location of the y int :250
		
		act.dragAndDropBy(min_slider, 100, 256).perform();  //added 100 in min_slider in x axis
		System.out.println("Location after moving it by 100 in x axis :"+min_slider.getLocation());
		
		
		WebElement max_slider = driver.findElement(By.xpath("//span[@tabindex='0'] [@style='left: 100%;']"));
		System.out.println("Default max slider location"+max_slider.getLocation());     //Default max slider location(613, 250)
		System.out.println("Location of the x int :"+max_slider.getLocation().getX());  //Location of the x int :613
		System.out.println("Location of the y int :"+max_slider.getLocation().getY());  //Location of the y int :250
		
		act.dragAndDropBy(max_slider, -115, 250).perform();  //Subtract 115 from max_slider in x axis
		System.out.println("Location after moving it by 115 in x axis :"+max_slider.getLocation());

		driver.close();
	}

}
