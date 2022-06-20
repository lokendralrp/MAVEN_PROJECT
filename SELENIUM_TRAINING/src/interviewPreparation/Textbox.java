package interviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement emailbox=driver.findElement(By.xpath("//input[@id='Email']"));
//clear the textbox		
		emailbox.clear();
		
		emailbox.sendKeys("admin@yourstore.com");
//capture text from textbox
		System.out.println("text entered in textbox= " +emailbox.getAttribute("value"));
		
//capture inner text if present (mostly inner text presents in links)
		System.out.println("inner text= " +emailbox.getText());
		
	}

}
