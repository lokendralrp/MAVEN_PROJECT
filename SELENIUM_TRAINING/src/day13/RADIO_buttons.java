package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RADIO_buttons 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

		driver.manage().window().maximize();
		
//Handling radio buttons
//----------------------------
//Conditional commands
					
		WebElement radiomale=driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label"));	
				
		System.out.println(radiomale.isDisplayed()); // check displayed or not - true
				
		System.out.println(radiomale.isEnabled()); //checks enable or not - true
				
		System.out.println("Before selecting radio button , the status is:"+radiomale.isSelected()); // false
						
		radiomale.click(); // select radio button
				
		System.out.println("After selecting radio button , the status is:"+radiomale.isSelected()); //true
				
				
		
	}

}
