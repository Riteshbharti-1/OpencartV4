package day46;
	
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportManager implements ITestListener
{

	public ExtentSparkReporter sparkReporter;
    public static ExtentReports extent;
    public static ExtentTest test;


    public void onStart(ITestContext context) {
       sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/ExtentReport.html");
       sparkReporter.config().setDocumentTitle("Automation Results");
       sparkReporter.config().setReportName("Functional Testing");
	   sparkReporter.config().setTheme(Theme.DARK);

	   extent = new ExtentReports();
	   extent.attachReporter(sparkReporter);
	   extent.setSystemInfo("Tester", "Ritesh Bharti");
	   extent.setSystemInfo("Computer name", "localhost");
	   extent.setSystemInfo("Environment", "QA");
	   extent.setSystemInfo("OS", "Windows 10");
	   extent.setSystemInfo("Browser", "Chrome");
	   }

	   @Override
	   public void onTestStart(ITestResult result) 
	   {
	      test = extent.createTest(result.getName());
	       
	   }

	   @Override
	   public void onTestSuccess(ITestResult result) 
	   {
		   	test = extent.createTest(result.getName());
		   	test.log(Status.PASS, "Test case passed is :"+result.getName());
		       
	   }

	   @Override
	   public void onTestFailure(ITestResult result) 
	   {
	   		test.log(Status.FAIL, "Test case failed is :"+result.getName());
	   		test.log(Status.FAIL, "Test case failed cause is :"+result.getThrowable());
	    }

	   @Override
	   public void onTestSkipped(ITestResult result) 
	   {
		   test=extent.createTest(result.getName());
		   test.log(Status.SKIP, "Test case skipped is :"+result.getName());
	   }

	   @Override
	   public void onFinish(ITestContext context) {
	   extent.flush();
	   }
	}