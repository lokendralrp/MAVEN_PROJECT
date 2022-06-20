package day23_extentReport;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Login 
{
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginTest()
	{
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(), " a Flight: Mercury Tours:");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

	@AfterMethod
	public void captureScreen(ITestResult result) throws IOException
	{
		if (result.getStatus() == ITestResult.FAILURE) 
		{
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "/Screenshot/" + result.getName() + ".png");
			
			try 
			{
				FileHandler.copy(source,target);
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
			System.out.println("Screenshot Captured");
		}
	}

}
