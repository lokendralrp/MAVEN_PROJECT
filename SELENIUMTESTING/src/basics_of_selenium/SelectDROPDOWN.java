package basics_of_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDROPDOWN 
{
	WebDriver driver;
	
	public void driverSetting()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	
	public void navigate()
	{
		driver.get("https://www.facebook.com/");	
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_2')]")).click();
	
		WebElement month=driver.findElement(By.name("birthday_month"));
		
		Select objm = new Select(month);
		//objm.selectByIndex(2);
		//objm.selectByValue("3");
		objm.selectByVisibleText("Mar");
	}
	
	public static void main(String[] args) 
	{
		SelectDROPDOWN sd =new SelectDROPDOWN ();
		sd.driverSetting();
		sd.navigate();
		
	}
	
}
