package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopup {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");  //injection process -->basic_auth
		
//if we are not able to inspect the login pop up very rarely some application can have this type of popup, so in 
//such condition we can use this process
		//Syntax: https://Username:Password@the-internet.herokuapp.com/basic_auth
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
				
	}

}
