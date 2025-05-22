package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
	/*	
		//single file upload
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Shourya\\1.pdf");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("1.pdf"))
		{
			System.out.println("File is successfully uploaded");
		}
		else
		{
			System.out.println("Upload failed");
		}
	*/
		
		//multiple file upload
		
		String file1 = ("C:\\Users\\Shourya\\1.pdf");
		String file2 = ("C:\\Users\\Shourya\\Xsquare_Handover_Doc.pdf");

		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2); 
		int totalfilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		//Validation 1: No.of files
		if(totalfilesUploaded==2)
		{
			System.out.println("All files are uploaded successfully");
		}
		else
		{
			System.out.println("Files aren't uploaded or incorrect files uploaded");
		}
		
		//validation 2: Validate files name
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("1.pdf") 
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Xsquare_Handover_Doc.pdf"))
		{
			System.out.println("Files name are matching..");
		}
		else
		{
			System.out.println("Files name mismatched..");
		}
		
		
	}
}
