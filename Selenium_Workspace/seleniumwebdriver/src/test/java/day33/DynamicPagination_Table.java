package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPagination_Table {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/index.php");
		
		WebElement username = driver.findElement(By.xpath("//*[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//*[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		WebElement submit_bttn = driver.findElement(By.xpath("//*[@type='submit']"));
		submit_bttn.submit();
		
		driver.findElement(By.xpath("//*[@class='parent']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		//Showing 1 to 10 of 21903 (2191 Pages)
		String text = driver.findElement(By.xpath("//div[contains(text(), 'Pages')]")).getText();
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		
		//repeating pages
		for(int p=1; p<=10; p++)
		//for(int p=1; p<=total_pages; p++)
		{
			if(p>1)
			{
				WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
				Thread.sleep(3000);
			}
			
			//reading data from the page
			int noOf_rows = driver.findElements(By.xpath("//*[@class='table table-bordered table-hover']//tbody//tr")).size();
			for(int r=2; r<=noOf_rows; r++)
			{
				String CustomerName = driver.findElement(By.xpath("//*[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String email = driver.findElement(By.xpath("//*[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String status = driver.findElement(By.xpath("//*[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
				
				System.out.println(CustomerName+"\t"+email+"\t"+status);
			}
			
		}

		
	}
	

}
