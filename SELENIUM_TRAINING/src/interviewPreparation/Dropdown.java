package interviewPreparation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//FOR MULTIPLE DROPDOWNS
public class Dropdown 
{
	public static void selectOption(WebElement ele, String value)
	{
		Select drp=new Select(ele);
		List<WebElement> option= drp.getOptions();
		for(WebElement op:option)
		{
			if(op.getText().equals(value))
			{
				op.click();
				break;
			}
		}
	}

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		selectOption(day, "09");
		
		//Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		selectOption(month, "JAN");
		
		//Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		selectOption(year, "1995");
		
		WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		selectOption(country, "India");
		
		WebElement city=driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
		selectOption(city, "Allahabad");
	
		System.out.println("selected all options");
	}
}
