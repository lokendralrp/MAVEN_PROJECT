package selfpractice;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AUTOMATION_PRACTICE 
{
	WebDriver driver;	
	@SuppressWarnings("deprecation")
	
	static String year="2022";
	static String month="";
	static String date="";
	
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
//providing control of chrome browser to the selenium		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	
	public void alert() throws InterruptedException
	{		
//ALERT
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		WebElement clickme=driver.findElement(By.xpath("//*[@id='HTML9']/div[1]/button"));
		clickme.click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(1000);
		String text= alert.getText();
		System.out.println("text on alert box= " +text);
		alert.accept();
	}
	
//current date
	public void currentdate() throws InterruptedException
	{
		WebElement datepicker=driver.findElement(By.xpath("//*[@id='datepicker']"));
		datepicker.click();
		
		Calendar cal=Calendar.getInstance();
		Thread.sleep(1000);
		int d=cal.get(Calendar.DATE);
		String date=String.valueOf(d);
		driver.findElement(By.linkText(date)).click();
	}
	
//previous date
	public void previousdate(String m, String d) throws InterruptedException
	{
		currentdate();
		
		Calendar cal= Calendar.getInstance();
		Thread.sleep(1000);
		WebElement datepicker=driver.findElement(By.xpath("//*[@id='datepicker']"));
		datepicker.click();
		
		int currentmonth=(cal.get(Calendar.MONTH)+1);
		
		for(int i=currentmonth; i>=1; i--)
		{
			WebElement prev=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span"));
			prev.click();			
			String month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
		
			if(month.equals(m))
			{
				driver.findElement(By.linkText(d)).click();
				break;
			}
		}
	}	
		
	
	
//future date
	public void futuredate(String d, String m) throws InterruptedException
	{
		Calendar cal=Calendar.getInstance();
		Thread.sleep(1000);
		WebElement datepicker=driver.findElement(By.xpath("//*[@id='datepicker']"));
		datepicker.click();
		
		int currentmonth=cal.get(Calendar.MONTH)+1;
		for(int i=currentmonth; i>=1; i++)
		{
			WebElement next=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span"));
			next.click();			
			String month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText(); //december
			
			if(month.equals(m))
			{
				driver.findElement(By.linkText(d)).click();
				break;
			}
		}	
	}
	

	
	
	public void dropdown()	throws InterruptedException
	{
//dropdown speed
		WebElement speed=driver.findElement(By.id("speed"));
		Select dropdown=new Select(speed);
		dropdown.selectByIndex(3);
		
		int size=dropdown.getOptions().size();
		System.out.println("size of speed dropdown= " +size);
		
		List <WebElement> options=dropdown.getOptions();
		for(WebElement e:options)
		{
			String option=e.getText();
			System.out.println(option);
		}
		Thread.sleep(1000);

//dropdown	file	
		WebElement file=driver.findElement(By.id("files"));		
		dropdown=new Select(file);
		dropdown.selectByValue("2");
		
		size=dropdown.getOptions().size();
		System.out.println("size of file dropdown= " +size);
		
		options=dropdown.getOptions();
		for(WebElement e:options)
		{
			String option=e.getText();
			System.out.println(option);
		}

		Thread.sleep(1000);
//dropdown	number
		WebElement number=driver.findElement(By.id("number"));		
		dropdown=new Select(number);
		dropdown.selectByVisibleText("2");
		
		size=dropdown.getOptions().size();
		System.out.println("size of number dropdown= "+size);

		options=dropdown.getOptions();
		for(WebElement e:options)
		{
			String option=e.getText();
			System.out.println(option);
		}
		Thread.sleep(1000);
		
//dropdown product
		WebElement product=driver.findElement(By.id("products"));
		dropdown=new Select(product);		
		dropdown.selectByVisibleText("Bing");
		
		size=dropdown.getOptions().size();
		System.out.println("size of product dropdown= "+size);

		options=dropdown.getOptions();
		for(WebElement e:options)
		{
			String option=e.getText();
			System.out.println(option);
		}	
	}
		
	public void insideframe() throws InterruptedException, IOException
	{
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame-one1434677811']"));
		driver.switchTo().frame(frame);
		
//firstname
		driver.findElement(By.xpath("//*[@id='RESULT_TextField-1']")).sendKeys("manish");
		Thread.sleep(500);

//lastname
		driver.findElement(By.xpath("//*[@id='RESULT_TextField-2']")).sendKeys("malhotra");;
		Thread.sleep(500);
//phone
		driver.findElement(By.xpath("//*[@id='RESULT_TextField-3']")).sendKeys("8899889988");
		Thread.sleep(500);
//country
		driver.findElement(By.xpath("//*[@id='RESULT_TextField-4']")).sendKeys("australia");
		Thread.sleep(500);
//city
		driver.findElement(By.xpath("//*[@id='RESULT_TextField-5']")).sendKeys("sydney");
		Thread.sleep(500);
//email
		driver.findElement(By.xpath("//*[@id='RESULT_TextField-6']")).sendKeys("johnsmithjohn@gmail.com");
		Thread.sleep(500);
//gender
		WebElement radiomale=driver.findElement(By.xpath("//*[@id='q26']/table/tbody/tr[1]/td/label"));
		radiomale.click();
		Thread.sleep(500);
//days-sunday,tuesday,saturday
		driver.findElement(By.xpath("//*[@id='q15']/table/tbody/tr[1]/td/label")).click();
		driver.findElement(By.xpath("//*[@id='q15']/table/tbody/tr[3]/td/label")).click();
		driver.findElement(By.xpath("//*[@id='q15']/table/tbody/tr[7]/td/label")).click();
		Thread.sleep(500);
//time
		WebElement time=driver.findElement(By.xpath("//*[@id='RESULT_RadioButton-9']"));
		Select dropdown=new Select(time);
		
		dropdown.selectByIndex(1);
		
//choose file
	//	WebElement choosefile=driver.findElement(By.name("RESULT_FileUpload-10"));
	//	choosefile.click();
	//	Thread.sleep(3000);
	//	Runtime.getRuntime().exec("C:\\AUTO IT\\automation practice.exe");
		
//submit
		driver.findElement(By.xpath("//*[@id='FSsubmit']")).click();
		
		driver.switchTo().defaultContent();
	}


	public void mouseactions() throws InterruptedException
	{
		Actions act =new Actions(driver);
//double click
		WebElement button=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		act.doubleClick(button).build().perform();
		Thread.sleep(500);
//drag and drop
		WebElement source_element=driver.findElement(By.id("draggable"));
		WebElement target_element=driver.findElement(By.id("droppable"));		
		act.dragAndDrop(source_element, target_element).build().perform();
		Thread.sleep(500);
//drag and drop pics
		WebElement source1=driver.findElement(By.xpath("//*[@id='gallery']/li[1]/img"));
		WebElement source2=driver.findElement(By.xpath("//*[@id='gallery']/li[2]/img"));
		WebElement targets=driver.findElement(By.xpath("//*[@id='trash']"));
		Thread.sleep(1000);
		act.dragAndDrop(source1, targets).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(source2, targets).build().perform();
		

//slider				
		Thread.sleep(1000);
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider']/span"));
		act.moveToElement(slider).dragAndDropBy(slider, 100, 0).build().perform();
		
//tooltip
		Thread.sleep(1000);
		WebElement tooltip=driver.findElement(By.id("age"));
		
		String tooltiptext=tooltip.getAttribute("title");
		System.out.println(tooltiptext);
		act.moveToElement(tooltip).build().perform();				
				
		
//scrolling		
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(500);
		WebElement up=driver.findElement(By.xpath("//*[@id='HTML10']/div[1]"));
		js.executeScript("arguments[0].scrollIntoView();",up);
		Thread.sleep(500);
		WebElement down=driver.findElement(By.xpath("//*[@id='Attribution1']/div[1]"));
		js.executeScript("arguments[0].scrollIntoView();",down);
		Thread.sleep(500);
		WebElement ups=driver.findElement(By.xpath("//*[@id='resizable']"));
		js.executeScript("arguments[0].scrollIntoView();",ups);
	}
		
	
	public void webtable()
	{
		int rows = driver.findElements(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr")).size();
		System.out.println("no. of rows in table= " +rows);
		
		int columns = driver.findElements(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[2]/td")).size();
		System.out.println("no. of columns in table= " +columns);
		
		System.out.println("BookName"+"		       		"+"Author"+"				"+"Subject"+"    	      "+"Price"    );
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1; c<=columns; c++)
			{
				String value= driver.findElement(By.xpath("//tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(value +" 			");				
			}
			System.out.println();
		}
	}
				
		
//search textbox
	public void search() throws InterruptedException
	{
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		searchbox.sendKeys("science");
		
		WebElement searchbutton=driver.findElement(By.xpath("//*[@id='Wikipedia1_wikipedia-search-form']/div/span[2]/span[2]/input"));
		searchbutton.click();
	
		List <WebElement> links= driver.findElements(By.xpath("//*[@id='wikipedia-search-result-link']/a"));
		
		int size=links.size();
		System.out.println("no. of links= " +size);
		System.out.println('\n');
		
		System.out.println("name of all links");
		for(WebElement e:links)
		{
			String link=e.getText();
			System.out.println(link);
			Thread.sleep(1000);
			driver.findElement(By.linkText(link)).click();	
		}
		
		System.out.println('\n');
		
//print handle values and title				
		Set <String> handlevalues= driver.getWindowHandles();
		System.out.println("handle values and titles are");
		for(String h:handlevalues)
		{
			System.out.println(h);
			
			String title=driver.switchTo().window(h).getTitle();
			System.out.println(title);
			
			//mouse hover
			Thread.sleep(2000);
			if(title.equals("Sciences Po - Wikipedia"))
			{
				WebElement pa=driver.findElement(By.linkText("Paris"));			
				WebElement na=driver.findElement(By.linkText("Nancy"));				
				WebElement lh=driver.findElement(By.linkText("Le Havre"));
				WebElement ge=driver.findElement(By.linkText("Grande École"));
				WebElement nap=driver.findElement(By.linkText("Napoleon III"));
							
				Actions act= new Actions(driver);
				act.moveToElement(pa).build().perform();
				Thread.sleep(3000);
				act.moveToElement(na).build().perform();
				Thread.sleep(3000);
				act.moveToElement(lh).build().perform();
				Thread.sleep(3000);
				act.moveToElement(ge).build().perform();
				Thread.sleep(3000);
				act.moveToElement(nap).build().perform();
				Thread.sleep(3000);
			}
			driver.close();
		}
	}	
	

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		AUTOMATION_PRACTICE ap=new AUTOMATION_PRACTICE ();
		
		ap.driverSettings();
		Thread.sleep(1000);
		
		ap.alert();
		Thread.sleep(2000);
		
		ap.currentdate();
		Thread.sleep(3000);
		
		ap.previousdate("January", "9");
		Thread.sleep(3000);
		
		ap.futuredate("25", "December");
		Thread.sleep(2000);
		
		ap.dropdown();
		Thread.sleep(2000);
		
		ap.insideframe();
		Thread.sleep(2000);
		
		ap.mouseactions();
		Thread.sleep(2000);
		
		ap.webtable();
		Thread.sleep(2000);
		
		ap.search();
	}
}
