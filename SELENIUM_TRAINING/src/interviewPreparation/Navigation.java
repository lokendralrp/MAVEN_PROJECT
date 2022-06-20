package interviewPreparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		
		
	}

}
