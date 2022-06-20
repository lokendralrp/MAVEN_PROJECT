package basics_of_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationtest 
{
	WebDriver driver;
	
	public void driverSetting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void testnavigation()
	{
		Navigation obj=driver.navigate();	//instance of Navigaiton interface
		
		obj.to("https://www.facebook.com/");
		obj.to("https://www.google.com/");
		obj.back();
		obj.refresh();
		obj.forward();
		
	}

	public static void main(String[] args) 
	{
		Navigationtest nt=new Navigationtest();
		nt.driverSetting();
		nt.testnavigation();
		
	}
	
}
