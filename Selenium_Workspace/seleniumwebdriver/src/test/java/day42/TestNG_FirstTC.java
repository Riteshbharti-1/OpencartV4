package day42;


import org.testng.annotations.Test;

public class TestNG_FirstTC {
	

//		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://jqueryui.com/effect");
		
		@Test(priority = 1)
		void openApp()
		{
			System.out.println("Opening application ...");
		}
		
		@Test(priority = 2)
		void login()
		{
			System.out.println("Log in to application ...");
		}
		
		@Test(priority = 3)
		void logout()
		{
			System.out.println("Log out to application ...");
		}
		
	}