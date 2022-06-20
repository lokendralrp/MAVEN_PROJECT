package selfpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Handling Drop down
 * Handling radio buttons
 * Handling check boxes
 * Handle Links
 */

public class VolunteerSignUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");

		driver.manage().window().maximize();
		
		String title=driver.getTitle();			// returns the title of the page
		System.out.println("title of the page is= " +title);
	
		String url= driver.getCurrentUrl();			// returns the URL of the page
		System.out.println("URL of the page is= " +url);
		
		//System.out.println(driver.getPageSource());		// returns HTML code for page
		
//firstname
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("mohan");
		//driver.findElement(By.xpath("//*[@id='RESULT_TextField-1']")).sendKeys("mohanish");		//2 WAYS TO WRITE XPATH
		
//Lastname
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("jodaro");
				
//phone
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("9898989898");
				
//country
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("INDIA");

//city
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("Aurangabad");
				
//email
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("mjaui@gmail.com");
				
		System.out.println('\n');		
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
					
	
		System.out.println('\n');
//Handling radio buttons
//----------------------------
//Conditional commands
					
		WebElement radiomale=driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label"));	
				
		System.out.println(radiomale.isDisplayed()); // check displayed or not - true
				
		System.out.println(radiomale.isEnabled()); //checks enable or not - true
				
		System.out.println("Before selecting radio button , the status is:"+radiomale.isSelected()); // false
						
		radiomale.click(); // select radio button
				
		System.out.println("After selecting radio button , the status is:"+radiomale.isSelected()); //true
				
		
		System.out.println('\n');
//Handling check boxes
//-----------------
						
		driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[1]/td/label")).click(); //Sunday
		driver.findElement(By.xpath("//*[@id='q15']/table/tbody/tr[4]/td/label")).click();

			
			
//Handle Links
		
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
