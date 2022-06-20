package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * driver.switchTo().frame(name)
 * driver.switchTo().frame(WebELement)
 * driver.switchTo().frame(index)
 */

public class FRAME_demo 
{
	WebDriver driver;
	
	public void frame()  throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C://JAVA//selenium//setup//chromedriver files/chromedriver.exe");
		driver= new ChromeDriver();
		
//open page
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/remote/AbstractDriverOptions.html");
		
		driver.manage().window().maximize();
		
//1st frame
		Thread.sleep(3000);
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click(); 
		
		driver.switchTo().defaultContent(); // go back to page/focus on the page

//2nd frame
		Thread.sleep(3000);
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("WebDriver")).click(); 
		
		driver.switchTo().defaultContent(); // go back to page/focus on the page
		
// 3rd frame
		Thread.sleep(3000);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[6]")).click(); 
		
		
	}
	
	public static void main(String[] args)  throws Exception
	{
		FRAME_demo fd=new FRAME_demo();
		fd.frame();
		
	}

}
