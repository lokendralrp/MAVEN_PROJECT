package auto_IT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

public class USER 
{
	public static void main(String[] args) throws InterruptedException, FindFailed, IOException 
    {
	
		System.setProperty("webdriver.chrome.driver","C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
	
	
		driver.findElement(By.xpath("//*[@id='section']/div/div/div[3]/div[2]")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C://JAVA//selenium//setup//AUTO IT//AUTO IT FILE//user.exe"+" " +"C:\\login.png");		//for cmd line code
    }

}
