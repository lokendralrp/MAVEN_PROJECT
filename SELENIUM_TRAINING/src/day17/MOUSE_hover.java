package day17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOUSE_hover 
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
			driver.get("https://www.orangehrm.com/");
			Thread.sleep(3000);
			WebElement plateform=driver.findElement(By.xpath("//*[@id='header-navbar']/ul[1]/li[1]/a"));
			Thread.sleep(3000);
			WebElement hrm=driver.findElement(By.xpath("//*[@id='header-navbar']/ul[1]/li[2]/a"));
			Thread.sleep(3000);
			WebElement it_mgr=driver.findElement(By.xpath("//*[@id='header-navbar']/ul[1]/li[2]/div/div/div[2]/div/div[1]/p[4]/a"));
			Thread.sleep(3000);
			
			Actions act= new Actions(driver);
			
			act.moveToElement(plateform).moveToElement(hrm).moveToElement(it_mgr).click().build().perform();
		}
		
		
		
		public static void main(String[] args) throws InterruptedException 
		{
			 MOUSE_hover mh=new  MOUSE_hover ();
			 mh.driverSettings();
			 mh.program();
			
			
		}

}
