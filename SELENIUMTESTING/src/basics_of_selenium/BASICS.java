package basics_of_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BASICS 
{
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public void driverSetting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void navigate()
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("arman");
		
		//WebElement email
		
	}
	
	
	public static void main(String[] args) 
	{
		BASICS obj=new BASICS();
		obj.driverSetting();
		obj.navigate();
	}
}
