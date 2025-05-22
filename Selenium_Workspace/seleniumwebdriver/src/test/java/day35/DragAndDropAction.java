package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//drag and drop Rome to Italy
		Actions act=new Actions(driver);
		WebElement Rome = driver.findElement(By.xpath("//*[@id='box6']"));
		WebElement Italy= driver.findElement(By.xpath("//*[@id='box106']"));
		act.dragAndDrop(Rome, Italy).perform();
		
		//drag and drop Washington to United States
		WebElement Washington = driver.findElement(By.xpath("//*[@id='box3']"));
		WebElement United_States= driver.findElement(By.xpath("//*[@id='box103']"));
		act.dragAndDrop(Washington, United_States).perform();
		
		
		//drag and drop Madrid to Spain
		WebElement Madrid = driver.findElement(By.xpath("//*[@id='box7']"));
		WebElement Spain= driver.findElement(By.xpath("//*[@id='box107']"));
		act.dragAndDrop(Madrid, Spain).perform();
		
		
		//drag and drop Oslo to Norway
		WebElement Oslo = driver.findElement(By.xpath("//*[@id='box1']"));
		WebElement Norway= driver.findElement(By.xpath("//*[@id='box101']"));
		act.dragAndDrop(Oslo, Norway).perform();
		
		
		//drag and drop Stockholm to Swedan
		WebElement Stockholm = driver.findElement(By.xpath("//*[@id='box2']"));
		WebElement Swedan= driver.findElement(By.xpath("//*[@id='box102']"));
		act.dragAndDrop(Stockholm, Swedan).perform();
		
		//drag and drop Copenhagen to Denmark
		WebElement Copenhagen = driver.findElement(By.xpath("//*[@id='box4']"));
		WebElement Denmark= driver.findElement(By.xpath("//*[@id='box104']"));
		act.dragAndDrop(Copenhagen, Denmark).perform();

		//drag and drop Seol to South_Korea
		WebElement Seol = driver.findElement(By.xpath("//*[@id='box5']"));
		WebElement South_Korea= driver.findElement(By.xpath("//*[@id='box105']"));
		act.dragAndDrop(Seol, South_Korea).perform();
	}

}
