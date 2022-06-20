package selfpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WATSAPP 
{
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://JAVA//selenium//setup//chromedriver files/chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[@id='pane-side']/div[1]/div/div/div[6]/div/div/div[2]/div[1]/div[1]/span/span")).click();
		
		driver.findElement(By.xpath("//*[@id='main']/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[2]")).sendKeys("hello");
	}

}
