package day16;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PAGINATION 
{
	WebDriver driver;
	
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
//providing control of chrome browser to the selenium		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void program() throws InterruptedException
	{
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");
		
		Thread.sleep(3000);
		
		WebElement Paging_Element=driver.findElement(By.xpath("//*[@id='dtBasicExample_paginate']"));
		
		List <WebElement> sub_links=Paging_Element.findElements(By.tagName("a"));
		
		System.out.println("Total number of paging links:"+ sub_links.size());
		
		if(sub_links.size()>0)
		{
			System.out.println("links are present");
			
			for(int i=1; i<=5; i++)
			{
				//WebElement link= driver.findElement(By.xpath("//a[contains(text(),'"+i+"')]"));
				WebElement link=driver.findElement(By.linkText("Next"));		//use i<=5 in for loop
				link.click();
				
				Thread.sleep(3000);
				
				int rows=driver.findElements(By.xpath("//*[@id='dtBasicExample']/tbody/tr")).size();
				
				for(int r=1; r<=rows; r++)
				{
					String col1=driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr["+r+"]/td[1]")).getText();
					String col2=driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr["+r+"]/td[2]")).getText();
					String col3=driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr["+r+"]/td[3]")).getText();
					String col4=driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr["+r+"]/td[4]")).getText();
					String col5=driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr["+r+"]/td[5]")).getText();
					String col6=driver.findElement(By.xpath("//*[@id='dtBasicExample']/tbody/tr["+r+"]/td[6]")).getText();
				
					System.out.println(col1+"				"+col2+"				"+col3+"				"+col4+"				"+col5+"				"+col6);
				}
			}
		}
		else
		{
			System.out.println("Links not Present");
		}
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		PAGINATION paging =new PAGINATION();
		paging.driverSettings();
		paging.program();
	}

}

//paging element diff xpath
//a[contains(text(),'"+i+"')]
//a[contains(text(),'6')]
//body/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/section[1]/section[1]/div[1]/div[1]/div[3]/div[2]/div[1]/ul[1]/li[6]/a[1]
//*[@id="dtBasicExample_paginate"]/ul/li[6]/a
