package day17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RIGHT_click 
{
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
//providing control of chrome browser to the selenium		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void program() throws InterruptedException
	{
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act= new Actions(driver);
		
		WebElement clickbutton = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
//right click on button		
		act.contextClick(clickbutton).build().perform();	//right click on button
		
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();		//click on copy option
		
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println("Text present on alert window is:" +alert.getText());
		alert.accept();
		
		WebElement clicklink = driver.findElement(By.xpath("/html/body/div/section/div/div/div/ul[1]/li[3]/a"));
		
		act.contextClick(clicklink).build().perform();	//right click on link
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		RIGHT_click rc=new  RIGHT_click ();
		 rc.driverSettings();
		 rc.program();
		
		
	}

}
