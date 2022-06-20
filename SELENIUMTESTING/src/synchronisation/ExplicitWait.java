package synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{
	WebDriver driver;
	
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void waits()
	{
		driver.get("https://www.facebook.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, 4000);
		
		WebElement emailtext=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		emailtext.sendKeys("testing");
	}
	
	
	public static void main(String[] args) 
	{
		ExplicitWait ew=new ExplicitWait();
		ew.driverSettings();
		ew.waits();
		
	}

}
