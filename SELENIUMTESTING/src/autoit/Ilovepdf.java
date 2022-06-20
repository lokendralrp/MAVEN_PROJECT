package autoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilovepdf 
{
	WebDriver driver;	
	@SuppressWarnings("deprecation")
	
	
	
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	public void uploadfile()
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.id("pickfiles")).click();
		
		
		try
		{
			Runtime.getRuntime().exec("C://JAVA//selenium//setup//AUTO IT//AUTO IT FILE//ilovepdf.exe");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		Ilovepdf ilp=new Ilovepdf();
		ilp.driverSettings();
		ilp.uploadfile();
	}

	
	

}
