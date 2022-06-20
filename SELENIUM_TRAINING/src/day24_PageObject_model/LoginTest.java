package day24_PageObject_model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class LoginTest 
{
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver= new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/newtours/");
	}

	void login()
	{
		LoginPage lp=new LoginPage (driver);
		lp.setUserName("mercury");
		lp.setPassword("mercury");
		lp.clickSubmit();
		
	}
	
	
	public static void main(String[] args) 
	{
		LoginTest lt=new LoginTest();
		lt.driverSettings();
		lt.login();
		
	}
	
	
	
	
}
