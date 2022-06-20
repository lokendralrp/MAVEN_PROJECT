package day14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LINK_commands 
{
	WebDriver driver;
	
	public void links()
	{
		System.setProperty("webdriver.chrome.driver", "C://JAVA//selenium//setup//chromedriver files/chromedriver.exe");
		driver= new ChromeDriver(); 
		
        driver.manage().window().maximize(); //maximize the page
        
//use Elements- plural form for one or more element	
//STORING ALL LINKS IN A VARIABLE        
		List <WebElement> links=driver.findElements(By.tagName("a"));  
		
		System.out.println("no. of links in the page= " +links.size());
		
//reading all the links from web page and display
		System.out.println("name of ALL links:");
		for(WebElement e:links)
		{
			System.out.println(e.getText());
		}
	}
	
	public static void main(String[] args) 
	{
		LINK_commands lc =new LINK_commands ();
		lc.links();
		
	}

}
