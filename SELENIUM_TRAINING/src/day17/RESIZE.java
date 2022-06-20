package day17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RESIZE 
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
		driver.get("https://jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
//switch to frame by webelement			
		WebElement frame= driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(frame); 
		
//switch to frame by index				
		//driver.switchTo().frame(0); 
		
		WebElement element=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		act.moveToElement(element).dragAndDropBy(element,200, 150).build().perform(); //resizing
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		RESIZE  rs=new RESIZE  ();
		
		rs.driverSettings();
		rs.program();
		
	}

}
