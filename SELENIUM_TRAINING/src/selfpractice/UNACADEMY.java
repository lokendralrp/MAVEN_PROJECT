package selfpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UNACADEMY 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://unacademy.com/login");
		
		driver.findElement(By.xpath("//*[@id='__next']/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/input")).sendKeys("7999571278");;
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='__next']/div[1]/div/div[1]/div[2]/div[1]/div[3]/button")).click();
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//*[@id='__next']/div[1]/div/div[1]/div[2]/div[1]/div[2]/button")).click();
		
	}
	

}
