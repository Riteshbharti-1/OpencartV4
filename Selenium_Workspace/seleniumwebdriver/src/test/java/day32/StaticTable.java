package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		
		//find total no.of rows in a table
		int Table_rows = driver.findElements(By.xpath("//*[@name='BookTable']//tr")).size();
		System.out.println("Total no.of rows :"+Table_rows);
		
		//find total no.of columns
		int Table_columns = driver.findElements(By.xpath("//*[@name='BookTable']//th")).size();
		System.out.println("Total no.of columns :"+Table_columns);
		
		
		//Read data from specific rows and columns - 5th row & 1st column
		//String BookName = driver.findElement(By.xpath("//*[@name='BookTable']//tr[5]//td[1]")).getText();
		String BookName = driver.findElement(By.xpath("//*[text()='Master In Selenium']")).getText();
		System.out.println("BookName (5th row & 1st column) is :"+BookName);

		
		//Read data from specific rows and columns -4th row & 3rd column
		String Subject = driver.findElement(By.xpath("//*[@name='BookTable']//tr[4]//td[3]")).getText();
		//String Subject=driver.findElement(By.xpath("(//*[text()='Javascript'])[1]")).getText();
		System.out.println("4th row & 3rd column data is: "+Subject);
		
		//Read data from all the rows and column
//		for(int r=2; r<=Table_rows; r++)
//		{
//			for(int c=1; c<=Table_columns; c++)
//			{
//				String Table_Data = driver.findElement(By.xpath("//*[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//				System.out.print(Table_Data+"\t");  //if we want in tabular format then here use print only and after the exit of for loop println
//			}										//here -->\t for one tab space
//			System.out.println(" ");
//		}
		
		
		//conditional data fetching from table - Print bookname whose author is Mukesh
//		for(int r=2; r<=Table_rows; r++)
//		{
//			String AuthorName = driver.findElement(By.xpath("//*[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//			
//			if(AuthorName.equals("Mukesh"))
//			{
//				String Bookname = driver.findElement(By.xpath("//*[@name='BookTable']//tr["+r+"]//td[1]")).getText();
//				System.out.print(Bookname+"\t"+AuthorName);
//			}
//			System.out.println("  ");
//		}
		
		// find total price of all the books
		
		int total=0;
		for(int r=2; r<=Table_rows; r++)
		{
			String Price = driver.findElement(By.xpath("//*[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total = total+Integer.parseInt(Price);
		}
		System.out.println(total);
		
		
		driver.close();
	}

}
