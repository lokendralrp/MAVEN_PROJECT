package interviewPreparation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SeleniumAutomation 
{
	 WebDriver driver;
	
	
	public void driverSettings()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.opencart.com/");
	}
	
/*	public static void basics()
	{
		driver.get("https://www.opencart.com/");
		
		String title=driver.getTitle();
		System.out.println("title of page = " +title);
		
		String url= driver.getCurrentUrl();
		System.out.println("current url= " +url);
		
		String pagesource= driver.getPageSource();
		System.out.println(pagesource);
	}
*/	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		SeleniumAutomation sa=new SeleniumAutomation ();
		sa.driverSettings();
		//basics();
		
	}
	
}
