package iframe_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME_test 
{
	WebDriver driver;	
	@SuppressWarnings("deprecation")
	
	
	
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	public void iframe()
	{
		driver.get("https://www.rediff.com/");
		
		driver.switchTo().frame("moneyiframe");
		driver.findElement(By.name("query")).sendKeys("testing");
		
		driver.switchTo().defaultContent();
	}
	
	
	public static void main(String[] args) 
	{
		IFRAME_test it=new IFRAME_test ();
		it.driverSettings();
		it.iframe();
		
		
	}

}
