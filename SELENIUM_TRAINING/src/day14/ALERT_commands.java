package day14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALERT_commands 
{
	WebDriver driver;
	
	public void alert_popup()
	{
		System.setProperty("webdriver.chrome.driver", "C://JAVA//selenium//setup//chromedriver files/chromedriver.exe");
		driver= new ChromeDriver(); 
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
       driver.manage().window().maximize();// maximize the page
//ClickMe button
       try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
       
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click(); 
		
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
		
		Alert alert=driver.switchTo().alert();
//read the text written in the alert box		
		System.out.println("Text present on alert window is:" +alert.getText());
		alert.accept();
		
		//driver.switchTo().alert().accept();//closes popup by using OK button
		//driver.switchTo().alert().dismiss();//closes popup by using Cancel button
	}
	
	public static void main(String[] args) 
	{
		ALERT_commands ac=new ALERT_commands();
		ac.alert_popup();
		
	}

}
