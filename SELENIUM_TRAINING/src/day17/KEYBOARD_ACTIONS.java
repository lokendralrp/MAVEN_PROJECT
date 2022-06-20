package day17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KEYBOARD_ACTIONS 
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

	public void program() throws InterruptedException
	{
		driver.get("http://the-internet.herokuapp.com/key_presses");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);

		act.sendKeys(Keys.ESCAPE).build().perform();
		
		Thread.sleep(3000);
		
		act.sendKeys(Keys.SPACE).build().perform();
		
		Thread.sleep(3000);
		
		act.sendKeys(Keys.DELETE).build().perform();
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		KEYBOARD_ACTIONS  ka=new KEYBOARD_ACTIONS  ();
		
		ka.driverSettings();
		ka.program();
		
	}

	
}
