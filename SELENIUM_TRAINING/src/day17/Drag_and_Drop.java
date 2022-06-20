package day17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop 
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
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		WebElement source_element=driver.findElement(By.id("box6")); //ROME - source element
		WebElement target_element=driver.findElement(By.id("box106"));//ITALY -target element
		
		WebElement source_element2=driver.findElement(By.id("box3")); //WASHINGTON - source element
		WebElement target_element2=driver.findElement(By.id("box103"));//US -target element
		
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		
		act.dragAndDrop(source_element, target_element).build().perform(); //Drag and drop
		Thread.sleep(3000);
		act.dragAndDrop(source_element2, target_element2).build().perform();
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		Drag_and_Drop dd=new Drag_and_Drop ();
		
		dd.driverSettings();
		dd.program();
		
	}

}
