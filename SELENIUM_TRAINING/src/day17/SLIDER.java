package day17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SLIDER 
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
		driver.get("https://jqueryui.com/slider/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		act.moveToElement(slider).dragAndDropBy(slider,400, 0).build().perform(); //moving the slider
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		SLIDER sl=new SLIDER ();
		
		sl.driverSettings();
		sl.program();
		
	}

}
