package day17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeyPress 
{
WebDriver driver;
	
	//@SuppressWarnings("deprecation")
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
//providing control of chrome browser to the selenium		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	
	public void program() throws InterruptedException
	{
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.CONTROL+"a").build().perform();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		MultipleKeyPress  mkp=new MultipleKeyPress();
		
		mkp.driverSettings();
		mkp.program();
		
	}


}
