package day17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HOMEWORK_DAY17 
{
	WebDriver driver;
	@SuppressWarnings("deprecation")
	
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");	
	}

	public void mouseActions() throws InterruptedException
	{
		Actions act=new Actions(driver);
/*		WebElement searchbox=driver.findElement(By.xpath("//*[@id='Wikipedia1_wikipedia-search-form']/div/span[2]/span[2]/input"));
		Thread.sleep(2000);
		WebElement copy=driver.findElement(By.xpath("//*[@id='HTML10']/div[1]/button"));
		Thread.sleep(2000);
		WebElement blogger=driver.findElement(By.linkText("Blogger"));
		Thread.sleep(2000);
*/			
//mouse hover		
		//act.moveToElement(searchbox).moveToElement(copy).moveToElement(blogger).build().perform();
/*	
//right click
		Thread.sleep(2000);
		WebElement click=driver.findElement(By.xpath("//*[@id='field2']"));
		act.contextClick(click).build().perform();
		Thread.sleep(1000);
		WebElement click1=driver.findElement(By.xpath("//*[@id='HTML10']/div[1]/button"));
		click1.click();
*/
		
//double click
		Thread.sleep(1000);
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id='HTML10']/div[1]/button"));
		act.doubleClick(doubleclick).build().perform();
		
//drag and drop
		Thread.sleep(1000);
		WebElement source=driver.findElement(By.xpath("//*[@id='draggable']/p"));
		WebElement target=driver.findElement(By.xpath("//*[@id='droppable']"));
		act.dragAndDrop(source, target).build().perform();
		
		WebElement source1=driver.findElement(By.xpath("//*[@id='gallery']/li[1]/img"));
		WebElement source2=driver.findElement(By.xpath("//*[@id='gallery']/li[2]/img"));
		WebElement targets=driver.findElement(By.xpath("//*[@id='trash']"));
		Thread.sleep(1000);
		act.dragAndDrop(source1, targets).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(source2, targets).build().perform();
		
		
		
//resize
		Thread.sleep(2000);
		WebElement source_ele=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		act.moveToElement(source_ele).dragAndDropBy(source_ele, 317, 284).build().perform();
	
		

//slider
		Thread.sleep(1000);
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider']/span"));
		act.moveToElement(slider).dragAndDropBy(slider, 100, 0).build().perform();
		
//scrolling		
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");

//tooltip
		Thread.sleep(1000);
		WebElement tooltip=driver.findElement(By.id("age"));
		
		String tooltiptext=tooltip.getAttribute("title");
		System.out.println(tooltiptext);
		act.moveToElement(tooltip).build().perform();
		
//select all
		Thread.sleep(1000);
		act.sendKeys(Keys.CONTROL+"a").build().perform();
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		HOMEWORK_DAY17 hw=new HOMEWORK_DAY17();
		hw.driverSettings();
		hw.mouseActions();
		
		
	}
	
	
}
