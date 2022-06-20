package scrrenshotsdemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SCREENSHOT 
{

	WebDriver driver;
	@SuppressWarnings("deprecation")
	
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver= new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	
	public void takescreenshot()
	{
		driver.get("https://www.facebook.com/");
		
		//TakesScreenshot scrshot = (TakesScreenshot)driver;
		//File source= scrshot.getScreenshotAs(OutputType.FILE);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\JAVA\\selenium\\setup\\SCREENSHOT\\login.png");
		
		try 
		{
			FileHandler.copy(source, target);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}


	public static void main(String[] args) 
	{
		SCREENSHOT ss=new SCREENSHOT ();
		ss.driverSettings();
		ss.takescreenshot();
		
	}
	

}
