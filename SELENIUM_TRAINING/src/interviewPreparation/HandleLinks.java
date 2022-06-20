package interviewPreparation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		
		driver.manage().window().maximize();
/*		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Books")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Last 30")).click();
*/
		driver.get("https://testautomationpractice.blogspot.com/");

		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total no. of links= " +links.size());
		for(int i=0; i<links.size(); i++) 
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}
		
		for(WebElement e:links)
		{
			System.out.println(e.getText());
			System.out.println(e.getAttribute("href"));
		}
		
		
		
		
		
		
	}
	

}
