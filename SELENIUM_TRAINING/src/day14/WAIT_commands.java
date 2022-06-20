package day14;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WAIT_commands 
{
	WebDriver driver;
	@SuppressWarnings("deprecation")		//for implicit wait
	
	public void waitdemo() 
	{
		System.setProperty("webdriver.chrome.driver", "C://JAVA//selenium//setup//chromedriver files/chromedriver.exe");
		driver= new ChromeDriver(); 
// implicit wait
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); // implicit wait
		
		//url
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		//fullname
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("safwan khan");


//explicit wait
		WebDriverWait mywait=new WebDriverWait(driver,4000);
		//rediffmail id
		WebElement rediffid=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")));
		rediffid.sendKeys("afsir786riyaz");
		
		
		//rediffmail id
		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]")).sendKeys("afsir786riyaz");
		
		//check availability
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		
/*
//Thread.sleep()		
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
*/		
		driver.close();
		
	}
	
	
	public static void main(String[] args) 
	{
		WAIT_commands wc=new WAIT_commands ();
		wc.waitdemo();
		
	}

}
