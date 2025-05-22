package day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
    
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("http://www.deadlinkcity.com");
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total no. of links: " + links.size());
        
        int noOfBrokenLinks = 0;
        
        for (WebElement linkElement : links) {
            String hrefAttValue = linkElement.getAttribute("href");
            
            if (hrefAttValue == null || hrefAttValue.isEmpty()) {
                System.out.println("Empty or null href attribute - skipping");
                continue;
            }
            
            try {
                URL linkURL = new URL(hrefAttValue);
                HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
                conn.setConnectTimeout(5000);
                conn.connect();
                
                if (conn.getResponseCode() >= 400) {
                    System.out.println(hrefAttValue + " --> Broken Link");
                    noOfBrokenLinks++;
                } else {
                    System.out.println(hrefAttValue + " --> Valid Link");
                }
                
            } catch (Exception e) {
                System.out.println(hrefAttValue + " --> Exception: " + e.getMessage());
            }
        }
        
        System.out.println("Total number of broken links: " + noOfBrokenLinks);
        driver.quit();
    }
}
