package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * driver.switchTo().frame(name)
 * driver.switchTo().frame(WebELement)
 * driver.switchTo().frame(index)
 */

public class Nested_i_Frame 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://JAVA//selenium//setup//chromedriver files/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//open page		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

// click button		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();

//switch to outer frame.		
		WebElement outerframe=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outerframe);
		
//switch to inner frame.	
		WebElement innerframe=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerframe);
		
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Testing");
		
	}

}
