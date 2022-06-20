package interviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenInNew 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
//OPEN NEW TAB		
		String tab=Keys.chord(Keys.CONTROL, Keys.ENTER);		
		
		driver.findElement(By.linkText("Checkboxes")).sendKeys(tab);
		
//OPEN URL IN NEW TAB & WINDOW
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://testautomationpractice.blogspot.com/");		
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
	}

}
