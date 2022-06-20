package interviewPreparation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAutomation 
{
	
	static WebDriver driver;
	
	public static void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public static void basics() throws InterruptedException
	{
		driver.get("https://www.opencart.com/");
		
		String title=driver.getTitle();
		System.out.println("title of page = " +title);
		
		String url= driver.getCurrentUrl();
		System.out.println("current url= " +url);
		
		//String pagesource= driver.getPageSource();
		//System.out.println(pagesource);
		
		WebElement reglink=driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[2]"));
		reglink.click();
		
		WebElement user=driver.findElement(By.id("input-username"));
		System.out.println("displayed= " +user.isDisplayed());
		System.out.println("enabled= " +user.isEnabled());
		
		WebElement country=driver.findElement(By.name("country_id"));
		System.out.println("selected= " +country.isSelected());
		
		Select country_drp= new Select(driver.findElement(By.id("input-country")));
		country_drp.selectByValue("223");
		Thread.sleep(3000);
		System.out.println("after selecting = " +country.isSelected());
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		driverSettings();
		basics();
		
	}
}
