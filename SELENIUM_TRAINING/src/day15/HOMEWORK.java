package day15;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HOMEWORK 
{
	WebDriver driver;
	static String title; 
	String h;
	@SuppressWarnings("deprecation") 
	
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
//providing control of chrome browser to the selenium		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void search() throws InterruptedException
	{
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		searchbox.sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Wikipedia1_wikipedia-search-form']/div/span[2]/span[2]/input")).click();
		
//xpath of links-----		//*[@id="wikipedia-search-result-link"]/a
		//*[@id="wikipedia-search-result-link"]/a
		List <WebElement> links= driver.findElements(By.xpath("//*[@id='wikipedia-search-result-link']/a"));
		int size=links.size();
		System.out.println("no. of links= " +size);
		
		System.out.println('\n');
		
//print all links	 and click on them	
		System.out.println("name of all links");
		for(WebElement e: links)
		{
			String link=e.getText();
			System.out.println(link);
			Thread.sleep(2000);
			driver.findElement(By.linkText(link)).click();	
			
			if(link.equals("Selenium disulfide"))
			{
				System.out.println(link.length());
			}
		}
		
		System.out.println('\n');

//print handle values and title		
		Set <String> handlevalues=driver.getWindowHandles();

		for(String h:handlevalues)
		{
			System.out.println(h);		//return handle value
			
			title=driver.switchTo().window(h).getTitle();
			System.out.println(title);					//return title of all pages
			Thread.sleep(2000);
			if(title.equals("Selenium dioxide - Wikipedia"))
			{
				driver.close();
			}
			Thread.sleep(2000);
			if(title.equals("Selenium in biology - Wikipedia"))
			{
				driver.findElement(By.linkText("selenium")).click();
				
			}
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		HOMEWORK hw = new HOMEWORK();
		hw.driverSettings();
		hw.search();
	}

}
