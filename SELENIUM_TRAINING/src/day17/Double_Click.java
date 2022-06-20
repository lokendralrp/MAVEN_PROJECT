package day17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click 
{
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
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
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement button=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(button).build().perform();//Double click
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		Double_Click dc=new Double_Click ();
		
		dc.driverSettings();
		dc.program();
		
	}

}
