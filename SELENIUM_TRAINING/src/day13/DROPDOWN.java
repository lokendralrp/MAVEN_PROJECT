package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DROPDOWN 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

		driver.manage().window().maximize();
		
//Handling Drop down
//---------------------------
		//WebElement drp=driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-7\"]"));
		//Select dropdown=new Select(drp);
				
		Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]")));
						
	// 1)Find how many options present in drop down
		System.out.println("No of Options present in drop down:" +dropdown.getOptions().size());
				
	//2) Extract all the options and print them
					
		List <WebElement> options=dropdown.getOptions();
					
		for(WebElement e:options)
		{
			System.out.println(e.getText());
		}
	
	//3) Select option from the dropdown 
		//dropdown.selectByVisibleText("Morning");
		//dropdown.selectByIndex(3);                  //Evening  --> index starts from 0
		dropdown.selectByValue("Radio-1"); //aFTERNOON
	}				

}
