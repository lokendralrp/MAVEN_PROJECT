package day22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.python.antlr.PythonParser.return_stmt_return;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidertest 
{
	WebDriver driver;
	
	@BeforeClass
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver= new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider = "users")			// dataProvider a parameter of @Test annotaion
	void logintest(String uname, String pwd)
	{
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("uname");
		driver.findElement(By.name("password")).sendKeys("pwd");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
	}
	
	@DataProvider(name="users")		// @DataProvider is annotation
	String[][] loginData()
	{
		String data[][]= { {"mercury","mercury"},{"mer","mer"},{"mercury1","mercury1"} };
		return data;
	}

	@AfterClass
	void closeBrowser()
	{
		driver.close();
	}
}
