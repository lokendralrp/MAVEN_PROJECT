package framework;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class utility 
{
	WebDriver driver;
	
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports report;
	public static ExtentTest logger;
	
	@SuppressWarnings("deprecation")
	public void driverSetting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	public WebElement elementfinder(By objby)
	{
		WebElement temp=driver.findElement(objby);
		return temp;
	}
	
	@BeforeSuite
	public void initreport()
	{
		htmlreporter =new ExtentHtmlReporter("C:\\JAVA\\selenium\\setup\\extent REPORTS\\samplereport\\reportlatest.html");
	    report=new ExtentReports();
		report.attachReporter(htmlreporter);
	}
	
	public void starttestcase(String testcasename)
	{
		logger=report.createTest(testcasename);
	}
	
	@AfterSuite
	public void endreport()
	{
		report.flush();
	}
	
	public void markstatus(String statusname, String description)
	{
		if(statusname.equalsIgnoreCase("pass"))
		{
			logger.log(Status.PASS, description);
		}
		else if(statusname.equalsIgnoreCase("fail"))
		{
			logger.log(Status.FAIL, description);
		}
		else if(statusname.equalsIgnoreCase("info"))
		{
			logger.log(Status.INFO, description);
		}
	}
	
	public ArrayList<String> dataread(String filepath ,String sheetname ,int cellno)
	{
		ArrayList<String> obj = new ArrayList<String>();
		try 
		{
			FileInputStream file = new FileInputStream(filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet(sheetname);
		
			int rowcnt = sheet.getLastRowNum();
			for (int r = 0; r <= rowcnt; r++)
			{
				XSSFRow row = sheet.getRow(r);
				String temp = row.getCell(cellno).getStringCellValue();
				obj.add(temp);
			}
			workbook.close();
			file.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return obj;
	}
}
