package day16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEB_TABLE_1 
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
	
	public void webtable()
	{
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

//no. of  rows - when there is one table
		//int rows=driver.findElements(By.tagName("tr")).size();
		//System.out.println("no. of rows= " +rows);

//no. of  rows - when there is more than one table
		int rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr")).size();
		System.out.println("no. of rows= " +rows);
		//*[@id="customers"]/tbody/tr[1]
		
//no of column		
		int columns=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th")).size();
		System.out.println("no. of column= " +columns);
		//*[@id="customers"]/tbody/tr[1]/th[1]
		
		System.out.println("Product"+"			"+"Article"+"			"+"Price");

//print all the table		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=columns;c++)
			{
				//*[@id="customers"]/tbody/tr[2]/td[1]
				String value=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(value+"			");
				
			}
			System.out.println();
		}
		
		
	}

	
	public static void main(String[] args) 
	{
		WEB_TABLE_1 wt=new WEB_TABLE_1 ();
		wt.driverSettings();
		wt.webtable();
		
	}
}
