package interviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.javadoc.io/static/org.seleniumhq.selenium/selenium-api/2.50.1/index.html?org/openqa/selenium/WebDriver.html");
		
		driver.switchTo().frame("packageListFrame");		
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/a")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		
		driver.switchTo().frame("packageFrame");		
		driver.findElement(By.xpath("/html/body/div/ul/li[3]/a")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.switchTo().frame("classFrame");		
		driver.findElement(By.xpath("/html/body/div[1]/ul/li[2]/a")).click();
		driver.switchTo().defaultContent();

		
//nested frame
		
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		Actions act=new Actions(driver);
//outer frame		
		driver.switchTo().frame("frame-top");
		Thread.sleep(1000);
//inner frame 1		
		driver.switchTo().frame("frame-left");
		Thread.sleep(1000);
		
		WebElement block1=driver.findElement(By.xpath("/html/body"));
		act.doubleClick(block1).perform();		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
//inner frame 2		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-right");
		
		WebElement block2=driver.findElement(By.xpath("/html/body"));
		act.doubleClick(block2).perform();
		driver.switchTo().defaultContent();
//inner frame 2		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		WebElement block3=driver.findElement(By.xpath("/html/body"));
		act.doubleClick(block3).perform();
		driver.switchTo().defaultContent();
		
//bottom frame		
		driver.switchTo().frame("frame-bottom");
		
		WebElement block4=driver.findElement(By.xpath("/html/body"));
		act.doubleClick(block4).perform();
		driver.switchTo().defaultContent();
		
	}
}
