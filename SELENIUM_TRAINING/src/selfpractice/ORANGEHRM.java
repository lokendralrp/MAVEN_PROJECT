package selfpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;    //import for username
import org.openqa.selenium.chrome.ChromeDriver;

public class ORANGEHRM 
{
	public static void main(String[] args) 
	{
//1) Open Web Browser
		
	//Chrome browser
		System.setProperty("webdriver.chrome.driver" , "C://JAVA//selenium//setup//chromedriver files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch chrome browser
		
//2) Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//3) Enter username  (Admin).
		//WebElement usernametxt=driver.findElement(By.id("txtUsername"));
		//usernametxt.sendKeys("Admin");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
//4) Enter password
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
//5) Click on Login.
		driver.findElement(By.name("Submit")).click();
				
//6) Capture title of the home page.
		String act_title=driver.getTitle(); // capture the title of cuurent page
		String exp_title="OrangeHRM";
				
//7) Verify title of the page: OrangeHRM 
				
		if(act_title.equals(exp_title))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
				
//8) Close browser
		driver.close();  //driver.quit();
	}

}