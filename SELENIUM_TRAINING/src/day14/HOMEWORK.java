package day14;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HOMEWORK 
{
	WebDriver driver;	
	@SuppressWarnings("deprecation")
	
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
//providing control of chrome browser to the selenium		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	
	public void alert() throws InterruptedException
	{
		WebElement clickbutton= driver.findElement(By.xpath("//*[@id='HTML9']/div[1]/button"));
		clickbutton.click();
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		
		String text=alert.getText();
		System.out.println("text on alert box= " +text);
		
		alert.accept();
	}

	public void links()
	{
//storing all links in a variable
		List <WebElement> links =driver.findElements(By.tagName("a"));
//no. of links		
		int size=links.size();
		System.out.println("no.of links in this page= " +size);
//print all links		
		for(WebElement e:links)
		{
			String link=e.getText();
			System.out.println(link);
//click all links			
			//driver.findElement(By.linkText(link)).click();
		}	
	}
	
	
	public void frame()
	{
		WebElement framename=driver.findElement(By.xpath("//*[@id='frame-one1434677811']"));
		driver.switchTo().frame(framename);
		
		WebElement firstname= driver.findElement(By.id("RESULT_TextField-1"));
		firstname.sendKeys("mahima");
		
		List <WebElement> links =driver.findElements(By.tagName("a"));
		for(WebElement e:links)
		{
			String link=e.getText();
			System.out.println(link);
		}	
		
		driver.switchTo().defaultContent();	
	}
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		HOMEWORK hw=new HOMEWORK();
		hw.driverSettings();
		hw.alert();
		
		hw.links();
		hw.frame();
		
	}
	

}
