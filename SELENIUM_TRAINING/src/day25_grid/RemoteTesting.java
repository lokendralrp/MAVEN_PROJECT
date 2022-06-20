package day25_grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteTesting
{
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test(priority = 1)
	public void setup() throws MalformedURLException
	{

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setBrowserName("internet explorer");

		driver = new RemoteWebDriver(new URL("http://192.168.71.210:4444"), cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test(priority = 2)
	public void loginTest()
	{
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		
		if(driver.getTitle().equals("Login: Mercury Tours"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	}
	
	@Test(enabled = false)
	public void closeBrowser()
	{
		driver.quit();
	}

}
