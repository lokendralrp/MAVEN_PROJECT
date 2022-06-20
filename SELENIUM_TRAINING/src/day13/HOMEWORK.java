package day13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HOMEWORK 
{
	WebDriver driver;
	Select dropdown;
	int size;
	String list;
	
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C://JAVA//selenium//setup//chromedriver files/chromedriver.exe");
		driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	
	public void dropdownSPEED()
	{
		WebElement speed=driver.findElement(By.id("speed"));
	
		dropdown=new Select(speed);
		dropdown.selectByIndex(3);
		
		size=dropdown.getOptions().size();
		System.out.println("size of speed dropdown= " +size);
		
		List <WebElement> options=dropdown.getOptions();
		for(WebElement e:options)
		{
			list=e.getText();
			System.out.println(list);
		}	
	}
	
	public void dropdownFILE()
	{
		WebElement file=driver.findElement(By.id("files"));
		
		dropdown=new Select(file);
		dropdown.selectByValue("2");
		
		size=dropdown.getOptions().size();
		System.out.println("size of file dropdown= " +size);
		
		List <WebElement> options=dropdown.getOptions();
		for(WebElement e:options)
		{
			list=e.getText();
			System.out.println(list);
		}
	}
	
	
	public void dropdownNUMBER()
	{
		WebElement number=driver.findElement(By.id("number"));
		
		dropdown=new Select(number);
		dropdown.selectByVisibleText("2");
		
		size=dropdown.getOptions().size();
		System.out.println("size of number dropdown= " +size);
		
		List <WebElement> options= dropdown.getOptions();
		for(WebElement e:options )
		{
			list=e.getText();
			System.out.println(list);
		}
	}
	
	
	public void dropdownPRODUCT()
	{
		WebElement product=driver.findElement(By.id("products"));
		dropdown=new Select(product);
		
		dropdown.selectByVisibleText("Bing");
		
		size=dropdown.getOptions().size();
		System.out.println("size of product dropdown= " +size);
		
		List <WebElement> options=dropdown.getOptions();
		for(WebElement e:options)
		{
			list = e.getText();
			System.out.println(list);
		}		
	}
	
	
	public void dropdownANIMAL()
	{
		WebElement animal=driver.findElement(By.id("animals"));
		
		dropdown=new Select(animal);
		dropdown.selectByValue("avatar");
		
		size=dropdown.getOptions().size();
		System.out.println("size of animal dropdown= " +size);
		
		List <WebElement> options=dropdown.getOptions();
		for(WebElement e:options)
		{
			list=e.getText();
			System.out.println(list);
		}
	}
	
	
	public void nAVIGATION() throws InterruptedException
	{
		driver.navigate().to("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
	}
	
	public void radiobuttons() throws InterruptedException
	{
		
		WebElement radiomale=driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label"));
		
		System.out.println("displayED= " +radiomale.isDisplayed());
		System.out.println("enableD= " +radiomale.isEnabled());
		radiomale.click();
		Thread.sleep(3000);
		System.out.println("selectED= " +radiomale.isSelected());
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		HOMEWORK hw=new HOMEWORK ();
		hw.driverSettings();
		hw.dropdownSPEED();				System.out.println('\n');
		hw.dropdownFILE();				System.out.println('\n');
		hw.dropdownNUMBER(); 			System.out.println('\n');
		hw.dropdownPRODUCT();			System.out.println('\n');
		hw.dropdownANIMAL();			System.out.println('\n');
		
		Thread.sleep(3000);
		hw.nAVIGATION();				System.out.println('\n');
		
		Thread.sleep(5000);
		hw.radiobuttons();
	}

}





















