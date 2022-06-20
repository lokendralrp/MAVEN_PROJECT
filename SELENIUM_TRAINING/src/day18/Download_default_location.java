package day18;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_default_location 
{
	WebDriver driver;
	
	public void driverSetting()
	{
		System.setProperty("webdriver.chrome.driver","C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
	}
	
	public void program() throws InterruptedException
	{
//download text file
		driver.findElement(By.id("textbox")).sendKeys("testing txt file download");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("link-to-download")).click();
	
//download pdf file		
		driver.findElement(By.id("pdfbox")).sendKeys("testing pdf downlaod");
		Thread.sleep(3000);
		driver.findElement(By.id("createPdf")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("pdf-link-to-download")).click();
	}
	
	
	static boolean isFileExist(String path)
	{
		File f=new File(path);
		
		if(f.exists())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		Download_default_location ddl=new Download_default_location ();
		ddl.driverSetting();
		ddl.program();
		
		//Downloads
		if(isFileExist("C://Users//my acer//Downloads/info.txt"))
		{
			System.out.println(" file exists");
		}
		else
		{
			System.out.println("file not exists");
		}
		
		Thread.sleep(5000);
		
		if(isFileExist("C://Users//my acer//Downloads/info.pdf"))
		{
			System.out.println(" file exists");
		}
		else
		{
			System.out.println("file not exists");
		}
		
	}
	
	

}
