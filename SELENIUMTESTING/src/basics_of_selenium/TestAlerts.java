package basics_of_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlerts 
{
	WebDriver driver;
	
	public void driverSetting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public void testalert()
	{
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//click submit button	
		driver.findElement(By.name("proceed")).click();	//alert generated here
		
		Alert objalert=driver.switchTo().alert();//creating an instance of alert interface
		String text=objalert.getText();
		System.out.println(text);
		
		objalert.accept();
		//objalert.dismiss();
		
		driver.switchTo().defaultContent();	
	}
	
	public static void main(String[] args) 
	{
		TestAlerts  ta =new TestAlerts ();
		ta.driverSetting();
		ta.testalert();	
	}
}
