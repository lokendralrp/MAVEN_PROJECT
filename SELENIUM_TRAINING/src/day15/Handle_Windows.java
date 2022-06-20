package day15;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Handle browser windows(switch between browser windows)
   -----
   * handle --> an ID for a browser window
   * 			changing every time
   * 
   * driver.getWindowHandle();----returns handle value for 1 page
   * 
   * driver.getWindowHandles();---returns handle values for multiple pages
*/
public class Handle_Windows 
{
	static String title; 
	
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver", "C://JAVA//selenium//setup//chromedriver files/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		
			driver.get("http://demo.automationtesting.in/Windows.html");

//print handle value for current window			
			String handleValue=driver.getWindowHandle();
			System.out.println(handleValue);

			System.out.println('\n');
			//click on link
			driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
			
			Set <String> handlevalues=driver.getWindowHandles();
	
//print handle values of all opening window
			for(String h:handlevalues)
			{
				System.out.println(h);
			}
			
//print title & close a page
		/*	for(String h:handlevalues)
			{
				title=driver.switchTo().window(h).getTitle();
				System.out.println(title);
				
				if(title.equals("Selenium") )
				{
					driver.close();
				}
			}
		*/
			
//other way to close
		/*	for(String h:handlevalues)
			{
				title=driver.switchTo().window(h).getTitle();
				System.out.println(title);
				
				if(title.equals("Selenium")|| title.equals("Frames & windows") )
				{
					driver.close();
				}
			}
		*/
			
//some other actions in other tab			
			
			for(String h:handlevalues)
			{
				title=driver.switchTo().window(h).getTitle();
				System.out.println(title);
				
				if(title.equals("Selenium") )
				{
					driver.findElement(By.partialLinkText("Charity ")).click(); //contact menu
				}
			}
		
			
		}	
}
