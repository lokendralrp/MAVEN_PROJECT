package interviewPreparation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.linkText("Blogger")).click();
		
		Set <String> windowIDs= driver.getWindowHandles();
		
//first way
		Iterator <String> it=windowIDs.iterator();
		String parent=it.next();
		String child=it.next();
		
		System.out.println("windowIDs= ");
		System.out.println(parent);
		System.out.println(child);
	
//second way
		
		System.out.println("handle values and titles are");
		for(String h: windowIDs)
		{
			System.out.println(h);
			
			String title=driver.switchTo().window(h).getTitle();
			System.out.println(title);
		}
		
		//perform actions on different handle of browser
		
		for(String h: windowIDs)
		{
			String title=driver.switchTo().window(h).getTitle();
			if(title.equals("Blogger.com - Create a unique and beautiful blog easily."))
			{
				driver.findElement(By.xpath("//*[@id=\"maincontent\"]/section[1]/header/a")).click();
			}
			else if(title.equals("Automation Testing Practice"))
			{
				driver.findElement(By.linkText("Blogger")).click();
				driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
