package day16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HOMEWORK_DAY16 
{
	WebDriver driver;
	@SuppressWarnings("deprecation")
	
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver= new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void webtable()
	{
		int count=0;
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//*[@id='HTML1']/div[1]/table/tbody/tr
		int rows=driver.findElements(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr")).size();
		System.out.println("no. of rows= " +rows);
		
		int columns=driver.findElements(By.xpath("//tbody/tr/th")).size();
		System.out.println("no. of columns= " +columns);
		System.out.println('\n');
		System.out.println("BookName"+"		       		"+"Author"+"				"+"Subject"+"    	      "+"Price"    );
//print rows and columns
		System.out.println();
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=columns; c++)
			{
				String value=driver.findElement(By.xpath("//tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(value+"				");
			}
			System.out.println();
		}

		System.out.println('\n');
		
//no. of books of selenium	
		System.out.println("name of author write selenium book");
		String subject="";
		String author="";
		for(int r=2; r<=rows; r++)
		{
			author=driver.findElement(By.xpath("//tbody/tr["+r+"]/td[2]")).getText();//for 2nd column
			subject=driver.findElement(By.xpath("//tbody/tr["+r+"]/td[3]")).getText();//for 3rd column(subject)
			//System.out.println(subject); 		//print all subject
			if(subject.equals("Selenium"))
			{
				System.out.println(author);
				count++;
			}
		}	
		System.out.println("no. of books of selenium = " +count);
		System.out.println("no. of books other than selenium = " +(rows-count));
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		HOMEWORK_DAY16 hw=new HOMEWORK_DAY16 ();
		hw.driverSettings();
		hw.webtable();
	}

}
