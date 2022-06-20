package interviewPreparation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAlerts 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Thread.sleep(1000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
	
//if alert box has input box
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alertwindow=driver.switchTo().alert();
		
		System.out.println("text in alert box= " +alertwindow.getText());
		

		//enter value in box
		alertwindow.sendKeys("welcome");
		Thread.sleep(3000);
		alertwindow.accept();
	
		
//if alert box has username password
		Thread.sleep(1000);
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a")).click();		//click on basic auth
		Thread.sleep(1000);
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(1000);

		
		
//permission alert
		//not working in this website
		
/*
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(1000);
		
*/		
		
	}
	

}
