package interviewPreparation;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleCheckbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
//select all
		//input[starts-with(@name,'layered')]		//11 checkbox
		//div[@class='checker']		//9 checkbox
		//*[starts-with(@name,'layered')]		//13 checkbox
		List<WebElement> cb=driver.findElements(By.xpath("//input[starts-with(@name,'layered')]"));
		System.out.println("size of checkbox= " +cb.size());
		
		for(WebElement e:cb)
		{
			e.click();
		}
		
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
//select based on choice
		cb=driver.findElements(By.xpath("//input[starts-with(@name,'layered')]"));
		for(WebElement e:cb)
		{
			String size=e.getAttribute("name");
			
			if(size.equals("layered_id_attribute_group_1")||size.equals("layered_id_attribute_group_3"))
			{
				e.click();
			}
		}

		
		
//select last 2 box
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame-one1434677811']"));
		driver.switchTo().frame(frame);
		List<WebElement> days=driver.findElements(By.xpath("//*[@id=\"q15\"]/table/tbody/tr/td/label"));
		int size=days.size();
		System.out.println("size= " +size);
		for(int i=size-2; i<size; i++)
		{
			days.get(i).click();
		}
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
//select first 3 box	
		frame=driver.findElement(By.xpath("//iframe[@id='frame-one1434677811']"));
		driver.switchTo().frame(frame);
		days=driver.findElements(By.xpath("//*[@id=\"q15\"]/table/tbody/tr/td/label"));
		size=days.size();
		for(int i=0; i<size; i++)
		{
			if(i<3)
			{
				days.get(i).click();			//0,1,2
			}
		}
		
	}

}
