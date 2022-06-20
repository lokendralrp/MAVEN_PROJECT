package interviewPreparation;

import java.util.Set;

//import org.apache.http.cookie.Cookie;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
//capture cookies	
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("no. of cookies= " +cookies.size());
		
//print all cookies	
		for(Cookie ck:cookies)
		{
			System.out.println(ck.getName()+"    "+ck.getValue());
		}
		
//ADD COOKIES
		Cookie cookieobj=new Cookie("cookiename123", "cookievalue456");
		driver.manage().addCookie(cookieobj);
		Cookie cookieobj1=new Cookie("cookie321", "cookievalue987");
		driver.manage().addCookie(cookieobj1);
		
		cookies=driver.manage().getCookies();
		System.out.println("no. of cookies= " +cookies.size());
	
//DELETE SPECIFIC
		driver.manage().deleteCookie(cookieobj);
		
		cookies=driver.manage().getCookies();
		System.out.println("no. of cookies= " +cookies.size());
				
//DELETE BY NAME
		driver.manage().deleteCookieNamed("optimizelySegments");
		
		cookies=driver.manage().getCookies();
		System.out.println("no. of cookies= " +cookies.size());
	
//DELETE ALL
		driver.manage().deleteAllCookies();
		
		cookies=driver.manage().getCookies();
		System.out.println("no. of cookies= " +cookies.size());
		
		
		
		
		
		
	}
	

}
