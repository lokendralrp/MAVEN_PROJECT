package interviewPreparation;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/*
 * 1. basics
 * 2. navigation
 * 3. textbox
 * 4. dropdown
 * 5. checkbox
 * 6. window handle
 * 7. links
 * 8. alerts
 * 9. frames
 * 10. webtable
 * keyboard & mouse actions
 * java script executor
 * 
 * 
 */






public class ALL_in_One 
{
	static WebDriver driver;
	
	public static void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
	}
	
	public static void basics() throws InterruptedException
	{
		driver.get("https://www.opencart.com/");
		
		String title=driver.getTitle();
		System.out.println("title of page = " +title);
		
		String url= driver.getCurrentUrl();
		System.out.println("current url= " +url);
		
		//String pagesource= driver.getPageSource();
		//System.out.println(pagesource);
		
		WebElement reglink=driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[2]"));
		reglink.click();
		
		WebElement user=driver.findElement(By.id("input-username"));
		System.out.println("displayed= " +user.isDisplayed());
		System.out.println("enabled= " +user.isEnabled());
		
		WebElement country=driver.findElement(By.name("country_id"));
		System.out.println("selected= " +country.isSelected());
		
		Select country_drp= new Select(driver.findElement(By.id("input-country")));
		country_drp.selectByValue("223");
		Thread.sleep(3000);
		System.out.println("after selecting = " +country.isSelected());
		
		driver.manage().window().minimize();
	}
	
	
	public static void navigation()
	{
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
	}
	
/*	
	public static void textbox()
	{
		driver.switchTo().newWindow(WindowType.TAB);
		
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
*/
	
//methods for multiple dropdown	
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
	
	
	public static void dropdowns()
	{
		driver.switchTo().newWindow(WindowType.WINDOW);
		
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
	
	
	public static void checkbox() throws InterruptedException 
	{
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
//select all
		//input[starts-with(@name,'layered')]		//11 checkbox
		//div[@class='checker']		//9 checkbox
		//*[starts-with(@name,'layered')]		//13 checkbox
		
		List<WebElement> cb=driver.findElements(By.xpath("//input[starts-with(@name,'layered')]"));
		System.out.println("size of checkbox= " +cb.size());
		
		for(WebElement e:cb)
		{
			e.click();
		}
		
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
//select based on choice
		cb=driver.findElements(By.xpath("//input[starts-with(@name,'layered')]"));
		for(WebElement e:cb)
		{
			String size=e.getAttribute("name");
			
			if(size.equals("layered_id_attribute_group_1")||size.equals("layered_id_attribute_group_3"))
			{
				e.click();
			}
		}
//select last 2 box
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame-one1434677811']"));
		driver.switchTo().frame(frame);
		List<WebElement> days=driver.findElements(By.xpath("//*[@id=\"q15\"]/table/tbody/tr/td/label"));
		int size=days.size();
		System.out.println("size= " +size);
		for(int i=size-2; i<size; i++)
		{
			days.get(i).click();
		}
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
//select first 3 box	
		frame=driver.findElement(By.xpath("//iframe[@id='frame-one1434677811']"));
		driver.switchTo().frame(frame);
		days=driver.findElements(By.xpath("//*[@id=\"q15\"]/table/tbody/tr/td/label"));
		size=days.size();
		for(int i=0; i<size; i++)
		{
			if(i<3)
			{
				days.get(i).click();			//0,1,2
			}
		}		
	}
	

	public static void windowHandle()
	{
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.linkText("Blogger")).click();
		
		Set <String> windowIDs= driver.getWindowHandles();
		
//first way
		Iterator <String> it=windowIDs.iterator();
		String parent=it.next();
		String child=it.next();
		
		System.out.println("windowIDs= ");
		System.out.println(parent);
		System.out.println(child);
	
//second way
		
		System.out.println("handle values and titles are");
		for(String h: windowIDs)
		{
			System.out.println(h);
			
			String title=driver.switchTo().window(h).getTitle();
			System.out.println(title);
		}
		
		//perform actions on different handle of browser
		
		for(String h: windowIDs)
		{
			String title=driver.switchTo().window(h).getTitle();
			String titlE=driver.getTitle();
			System.out.println("title= " +titlE);
			if(title.equals("Blogger.com - Create a unique and beautiful blog easily."))
			{
				driver.findElement(By.xpath("//*[@id=\"maincontent\"]/section[1]/header/a")).click();
			}
			else if(title.equals("Automation Testing Practice"))
			{
				driver.findElement(By.linkText("Blogger")).click();
				driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
			}
		}	
	}
	
	public static void handleLinks() throws InterruptedException
	{
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Fashion")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Me")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://testautomationpractice.blogspot.com/");

		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total no. of links= " +links.size());
		for(int i=0; i<links.size(); i++) 
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}
		
		for(WebElement e:links)
		{
			System.out.println(e.getText());
			System.out.println(e.getAttribute("href"));
		}
		
		
	}
	
	public static void alerts() throws InterruptedException
	{
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Thread.sleep(1000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
	
//if alert box has input box
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alertwindow=driver.switchTo().alert();
		
		System.out.println("text in alert box= " +alertwindow.getText());
		

		//enter value in box
		alertwindow.sendKeys("welcome");
		Thread.sleep(3000);
		alertwindow.accept();
	
		
//if alert box has username password
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(1000);
		
		//click on basic auth
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a")).click();		
		Thread.sleep(1000);
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(1000);

		
		
//permission alert
		//not working in this website
		
/*
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(1000);
		
*/		
	}
	
	public static void frames() throws InterruptedException
	{
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.javadoc.io/static/org.seleniumhq.selenium/selenium-api/2.50.1/index.html?org/openqa/selenium/WebDriver.html");
		
		driver.switchTo().frame("packageListFrame");		
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/a")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		
		driver.switchTo().frame("packageFrame");		
		driver.findElement(By.xpath("/html/body/div/ul/li[3]/a")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.switchTo().frame("classFrame");		
		driver.findElement(By.xpath("/html/body/div[1]/ul/li[2]/a")).click();
		driver.switchTo().defaultContent();

		
//nested frame
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		Actions act=new Actions(driver);
//outer frame		
		driver.switchTo().frame("frame-top");
		Thread.sleep(1000);
//inner frame 1		
		driver.switchTo().frame("frame-left");
		Thread.sleep(1000);
		
		WebElement block1=driver.findElement(By.xpath("/html/body"));
		act.doubleClick(block1).perform();		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
//inner frame 2		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-right");
		
		WebElement block2=driver.findElement(By.xpath("/html/body"));
		act.doubleClick(block2).perform();
		driver.switchTo().defaultContent();
//inner frame 2		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		WebElement block3=driver.findElement(By.xpath("/html/body"));
		act.doubleClick(block3).perform();
		driver.switchTo().defaultContent();
		
//bottom frame		
		driver.switchTo().frame("frame-bottom");
		
		WebElement block4=driver.findElement(By.xpath("/html/body"));
		act.doubleClick(block4).perform();
		driver.switchTo().defaultContent();
	}
	
	public static void webtable()
	{
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.selenium.dev/ecosystem/");
		
		int rows=driver.findElements(By.xpath("/html/body/div/main/div[4]/div/table/tbody/tr")).size();
		System.out.println("rows= " +rows);
		
		int columns=driver.findElements(By.xpath("/html/body/div/main/div[4]/div/table/thead/tr[1]/th")).size();
		System.out.println("columns= " +columns);
//retrieve specific row-cell value
		String value=driver.findElement(By.xpath("/html/body/div/main/div[4]/div/table/tbody/tr[1]/td[1]")).getText();
		System.out.println("value= " +value);
		
//retrieve all data
		for(int r=1; r<=rows; r++)
		{
				String data1=driver.findElement(By.xpath("/html/body/div/main/div[4]/div/table/tbody/tr["+r+"]/th[1]")).getText();
				String data2=driver.findElement(By.xpath("/html/body/div/main/div[4]/div/table/tbody/tr["+r+"]/td[1]")).getText();
				String data3=driver.findElement(By.xpath("/html/body/div/main/div[4]/div/table/tbody/tr["+r+"]/td[2]")).getText();
				System.out.print(data1+ "      					    "+data2 + "     					     "+data3);
			
			System.out.println();
		}

		
//print specific rows or column by condition
		driver.switchTo().newWindow(WindowType.TAB);	
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		int row=driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr")).size();
		
		for(int r=2; r<=row; r++)
		{
			String book= driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+r+"]/td[1]")).getText();
			
			if(book.equals("Master In Selenium"))
			{
				String author=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+r+"]/td[2]")).getText();
				String subj=driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+r+"]/td[3]")).getText();
				System.out.println(book+ "        " +author+ "        " +subj);
			}
		}
		
	}
	
	public static void actions()
	{
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://text-compare.com/");
		
		WebElement box1=driver.findElement(By.xpath("//*[@id=\"inputText1\"]"));
		box1.sendKeys("welcome to rewa");
		
		WebElement box2=driver.findElement(By.xpath("//*[@id=\"inputText2\"]"));
		
		Actions act=new Actions(driver);
//CTRL+A				
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");		
		act.keyUp(Keys.CONTROL);		
		act.perform();		
//CTRL+C				
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");		
		act.keyUp(Keys.CONTROL);		
		act.perform();				
		
//TAB
		act.sendKeys(Keys.TAB).perform();
		
//CTRL+V		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");		
		act.keyUp(Keys.CONTROL);		
		act.perform();	
		
		if(box1.getAttribute("value").equals(box2.getAttribute("value")))
		{
			System.out.println("text copied");
		}
		else 
		{
			System.out.println("text not copied");

			
		}
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://text-compare.com/");
//DRAG AND DROP
		
		
		
		
		
		
	}
	
	public static void jsexecuter() throws InterruptedException
	{
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		WebElement searchbox;
		driver.get("https://text-compare.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		

//TITLE
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
			
		
//SCROLL UP AND DOWN
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//UP
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//DOWN
		
//ZOOM
		js.executeScript("document.body.style.zoom='50%'");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		
//FLASH
		searchbox =driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		String bgcolor= searchbox.getCssValue("backgroundColor");
		for(int i=0; i<10; i++)
		{
			changeColor("#000000", searchbox, driver);
			changeColor(bgcolor, searchbox, driver);
		}
//DRAW BORDER
		WebElement element=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
		js.executeScript("arguments[0].style.border='3px solid red'", element);
						
		
	}
	
	public static void changeColor(String color, WebElement ele, WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("(arguments[0].style.backgroundColor='"+color+"')", ele);
	}
	
	
	
	

}
