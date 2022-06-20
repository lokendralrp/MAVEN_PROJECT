package extentreport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTest 
{
    WebDriver driver;
	
	ExtentHtmlReporter htmlreporter;
	ExtentReports report;
	ExtentTest logger;
	
	@SuppressWarnings("deprecation")
	public void driverSetting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		htmlreporter =new ExtentHtmlReporter("C:\\JAVA\\selenium\\setup\\extent REPORTS\\samplereport\\rediffmail.html");
	    report=new ExtentReports();
		report.attachReporter(htmlreporter);
	}
	
	public void alerts()
	{
		String expectedresult= "test message";
		logger=report.createTest("Basic popup testing");
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		logger.log(Status.INFO, "Navigate to website");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert objAlert=driver.switchTo().alert();
		logger.log(Status.INFO, "alert generated successfully");
		
		String actualresult=objAlert.getText();
		objAlert.dismiss();
		driver.switchTo().defaultContent();		
		logger.log(Status.INFO, "alert dismissed successfully");
		
		if(expectedresult.equals(actualresult))
		{
			logger.log(Status.PASS, "alert text message displayed successfully");
		}
		else 
		{
			logger.log(Status.FAIL, "alert text message mismatch");			
		}
		
		//creating second test case in report
		logger=report.createTest("second test case");
		logger.log(Status.PASS, "sample test case pass two");
		report.flush();
		
	}
	
	public static void main(String[] args) 
	{
		ExtentReportTest ert=new ExtentReportTest ();
		ert.driverSetting();
		ert.alerts();
		
	}
	



}
