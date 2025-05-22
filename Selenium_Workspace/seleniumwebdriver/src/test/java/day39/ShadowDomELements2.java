package day39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomELements2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://dev.automationtesting.in/shadow-dom");
        
   //Only CSS can handle shadow dom elements    
        //This element is inside single shadow Dom

        SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        Thread.sleep(1000);
        System.out.println(shadow.findElement(By.cssSelector("#shadow-element")).getText());
        
        
        //This element is inside 2-nested shadow Dom
        SearchContext nestedshadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext nestedshadow1 = nestedshadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        Thread.sleep(1000);
        System.out.println(nestedshadow1.findElement(By.cssSelector("#nested-shadow-element")).getText());
        
        
        //This element is inside 2-nested shadow Dom
        
        SearchContext multinested0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext multinested1 = multinested0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext multinested2 = multinested1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
        Thread.sleep(1000);
        System.out.println(multinested2.findElement(By.cssSelector("#multi-nested-shadow-element")).getText());
		
	}

}
