package interviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKey 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://text-compare.com/");
		
		WebElement box1=driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));
		box1.sendKeys("welcome to rewa");
		
		WebElement box2=driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
		
		Actions act=new Actions(driver);
//CTRL+A				
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");		
		act.keyUp(Keys.CONTROL);		
		act.perform();		
//CTRL+C				
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");		
		act.keyUp(Keys.CONTROL);		
		act.perform();				
		
//TAB
		act.sendKeys(Keys.TAB).perform();
		
//CTRL+V		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");		
		act.keyUp(Keys.CONTROL);		
		act.perform();	
		
		if(box1.getAttribute("value").equals(box2.getAttribute("value")))
		{
			System.out.println("text copied");
		}
		else 
		{
			System.out.println("text not copied");

			
		}
	}
	
	

}
