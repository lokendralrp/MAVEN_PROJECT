package day22.parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest 
{
	WebDriver driver;
	
	@Parameters("browser")
	@Test(priority=1)
	public void launchbrowser(String br) 
	{

		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://JAVA//selenium//setup//chromedriver files/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","C://JAVA//selenium//setup//IE driver files/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.get("https://www.rediff.com/");	
	}

	@Test(priority=2)
	public void verifyTitle() 
	{
		
		Assert.assertEquals(driver.getTitle(),"Welcome: Mercury Tours");
	}

	@Test(priority=3)
	public void registration() 
	{

		Assert.assertTrue(true);
		//write code for registration process
	}

	@Test(priority=4)
	public void closeBrowser() 
	{
		//driver.close();
	}

}
