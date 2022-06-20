package day16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEB_TABLE_2 
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
		
		public void login() throws InterruptedException
		{
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();	
			
			Thread.sleep(3000);
			
//Admin-->Usermanagement-->Users
			
			driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
			
		}
		
		public void webtable()
		{
			int rows=driver.findElements(By.xpath("//tbody/tr")).size();
			System.out.println(rows);
			
			int count=0;

//print 5th column			
			for(int r=1;r<=rows;r++)
			{
				String status=driver.findElement(By.xpath("//tbody/tr["+r+"]/td[5]")).getText();
				
				if(status.equals("Enabled"))
				{
					count++; //1 2 3........
				}
				
			}
			
			System.out.println("Number of enabled employees:"+ count);
			System.out.println("Number of disabled employees:"+ (rows-count));
		}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		WEB_TABLE_2 wt=new WEB_TABLE_2 ();
		wt.driverSettings();
		wt.login();
		wt.webtable();
	}

}
