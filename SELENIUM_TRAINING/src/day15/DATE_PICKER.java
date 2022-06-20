package day15;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DATE_PICKER 
{
	public static WebDriver driver;
	
	static String year="2021";
	static String month="January";
	static String date="25";
	
	public static void driverSettings() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
//providing control of chrome browser to the selenium		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
//open page		
		driver.get("http://demo.automationtesting.in/Frames.html");	
		
		driver.findElement(By.linkText("Widgets")).click();
		driver.findElement(By.linkText("Datepicker")).click();
//click on date picker element
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img")).click();	
	}
	
/*	
	static void selectCurrentDate()
	{
		Calendar cal=Calendar.getInstance();
		
		int d=cal.get(Calendar.DATE); // return the current date in int format
		String date=String.valueOf(d); //convert int to string
		
//linkText accepts only text i.e. string		
		driver.findElement(By.linkText(date)).click();
	}
*/	
/*	
	static void selectFutureDate(String d,String m)
	{
		Calendar cal=Calendar.getInstance();
		
		int currentmonth=cal.get(Calendar.MONTH)+1; // return the current month in int format
											//here month starts from 0, i.e.jan=0, so we make month+1
		for(int i=currentmonth;i>=1;i++)
		{
//Next arrow			
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
//returns month name			
			String month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
			
			if(month.equals(m))
			{
				driver.findElement(By.linkText(d)).click();//d given as parameter
				break;
			}
		}
	}
*/	

	static void selectPastDate(String d,String m)
	{
		Calendar cal=Calendar.getInstance();
		
		int currentmonth=cal.get(Calendar.MONTH)+1; // return the current date in int format
		
		for(int i=currentmonth;i>=1;i--)
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();//Prev arrow
			
			String month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
			
			
			if(month.equals(m))
			{
				driver.findElement(By.linkText(d)).click();
				break;
			}
		}
	}
	
	
	public static void main(String[] args) throws Exception
	{
		driverSettings();
		//selectCurrentDate();
		//selectFutureDate(date,month);
		selectPastDate(date,month);
		
	}
	
	

}
