package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {
	
//Actions-->Class, will be used to perform mouse actions
//Action-->interface, will be used to store created actions.	

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement right_click = driver.findElement(By.xpath("//*[text()='right click me']"));
		
		Actions act=new Actions(driver);
		//act.contextClick(right_click).build().perform();
		
		Action myaction = act.contextClick(right_click).build(); //building and creating an action and storing into a variable
		myaction.perform();


		
			
		
	}
	
	

}
