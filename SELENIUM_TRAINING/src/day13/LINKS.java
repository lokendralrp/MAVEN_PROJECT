package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LINKS 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
//open url
		//driver.navigate().to(url);
		driver.manage().window().maximize();
	
//Handle Links
//NAVIGATIONAL COMMANDS
		
		driver.findElement(By.linkText("Software Testing Tutorials")).click();
		Thread.sleep(300);
		System.out.println(driver.getTitle());
		driver.navigate().back(); 				// go back to your previous page
		Thread.sleep(300);
		
		driver.findElement(By.partialLinkText("Tools Training")).click();
		Thread.sleep(300);
		System.out.println(driver.getTitle());
		driver.navigate().back(); 				// go back to your previous page
		Thread.sleep(300);
				
		driver.navigate().forward();			//move forward to your page
		Thread.sleep(300);
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh(); 			//refresh the page
		
		driver.quit();
			
		
	}

}
