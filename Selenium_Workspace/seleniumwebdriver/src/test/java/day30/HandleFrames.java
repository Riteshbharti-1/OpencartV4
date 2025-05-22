package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Frame-1
		driver.get("https://ui.vision/demo/webtest/frames");
		WebElement frame1 = driver.findElement(By.xpath("//*[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@name='mytext1']")).sendKeys("Welcome");
		
		//go back to default page
		driver.switchTo().defaultContent();
		
		//Frame-2
		WebElement frame2 = driver.findElement(By.xpath("//*[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[@name='mytext2']")).sendKeys("Selenium");
		
		//go back to default page
		driver.switchTo().defaultContent();
		
		//Frame-3
		WebElement frame3 = driver.findElement(By.xpath("//*[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//*[@name='mytext3']")).sendKeys("Automation");
		
		//inner iframe--> which is a part of Frame-3
		driver.switchTo().frame(0);  //switching to frame using index, only single frame is present here
		driver.findElement(By.xpath("(//*[@class='AB7Lab Id5V1'])[2]")).click();
		
		//go back to default page
		driver.switchTo().defaultContent();
		
		//Frame-4
		WebElement frame4 = driver.findElement(By.xpath("//*[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//*[@name='mytext4']")).sendKeys("day-30");
		
		//go back to default page
		driver.switchTo().defaultContent();
		
		//Frame-5
		WebElement frame5 = driver.findElement(By.xpath("//*[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//*[@name='mytext5']")).sendKeys("Java");
		driver.findElement(By.xpath("//a[text()='https://a9t9.com']")).click();
		//go back to default page
		//driver.switchTo().defaultContent();
	}

}
