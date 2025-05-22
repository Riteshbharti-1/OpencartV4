package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		
		//Self - Select the current node
		String txt = driver.findElement(By.xpath("//a[contains(text(), 'L&T')]/self::a")).getText();
		System.out.println(txt);
		
		txt = driver.findElement(By.xpath("//a[contains(text(), 'L&T')]/parent::td")).getText();
		System.out.println(txt);
	}

}
