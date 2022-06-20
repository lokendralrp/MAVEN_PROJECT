package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("deprecation")
public class Basic 
{
	WebDriver driver;
	
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
//providing control of chrome browser to the selenium		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void navigate()
	{
		driver.get("https://www.facebook.com/");
		//WebElement id= driver.findElement(By.name("email"));
		//id.sendKeys("selenium");
		
		WebElement password= driver.findElement(By.name("pass"));
		password.sendKeys("test123");
		
		WebElement id= driver.findElement(By.name("email"));		//we can write id after password this way
		id.sendKeys("selenium");		
	}
	
	
	public static void main(String[] args) 
	{
		Basic basic = new Basic ();
		basic.driverSettings();	
		basic.navigate();
		
	}
}

/*
 *  WebDriver is an interface
 * 
 * it helps to provide control of chrome browser to the selenium
 * 	
 * ChromeDriver class already implements this WebDriver interface
 * 
 */
