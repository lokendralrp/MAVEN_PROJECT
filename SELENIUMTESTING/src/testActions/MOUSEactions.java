package testActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOUSEactions //user defined class
{							//string is a java defined class
	WebDriver driver;
	
	public void driverSetting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	public void actions() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		
		WebElement emailtextbox=driver.findElement(By.name("email"));
				
		Actions obj=new Actions(driver); //selenium defined class
		obj.contextClick(emailtextbox).perform();
		
//keyboard actions
		Thread.sleep(2000);
		obj.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		obj.sendKeys(Keys.PAGE_UP).perform();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		MOUSEactions ma = new MOUSEactions();
		ma.driverSetting();
		ma.actions();
	}

}
