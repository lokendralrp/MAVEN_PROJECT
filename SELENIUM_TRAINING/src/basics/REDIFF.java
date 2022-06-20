package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class REDIFF 
{
	WebDriver driver;
	WebElement dropdown;
	@SuppressWarnings("deprecation")
	
	public void starts()
	{
		System.setProperty("webdriver.chrome.driver", "C://JAVA//selenium//setup//chromedriver files/chromedriver.exe");
		driver= new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // implicit wait
//url		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
//fullname		
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("safwan khan");
		
//id
		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]")).sendKeys("afsir786riyaz");
		
//check availbility		
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		
//password
		driver.findElement(By.xpath("//tbody/tr[9]/td[3]/input[1]")).sendKeys("amishA!007");
		
//Retype password		
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("amishA!007");
		
//Alternate Email Address		
	//	driver.findElement(By.xpath("//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input")).sendKeys("khan786zoya");
		
//CLICK CHECKBOX
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
		
//security question
		dropdown =driver.findElement(By.xpath("//*[@id='div_hintQS']/table/tbody/tr[2]/td[3]/select"));
		Select question= new Select(dropdown);
		question.selectByIndex(02);
		
//answer
		driver.findElement(By.xpath("//*[@id='div_hintQS']/table/tbody/tr[4]/td[3]/input")).sendKeys("greenfield");
		
//mothers name
		//*[@id="div_hintQS"]/table/tbody/tr[6]/td[3]/input
		driver.findElement(By.xpath("//*[@id='div_hintQS']/table/tbody/tr[6]/td[3]/input")).sendKeys("aashma");
		
//Mobile No.		
		driver.findElement(By.xpath("//input[@id='mob']")).sendKeys("9898989898");	
		//driver.findElement(By.id("mobile")).sendKeys("9898989898");	
		
//Date of Birth		
			dropdown =driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Day')]"));
			Select day= new Select(dropdown);
//Day
			 day.selectByIndex(8);
//Month
			dropdown =driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Month')]"));
			Select month= new Select(dropdown);
			month.selectByValue("01");
//Year
			dropdown =driver.findElement(By.xpath("//*[starts-with(@name,'DOB_Year')]"));
			Select year= new Select(dropdown);
			year.selectByVisibleText("1995");

//Gender
			WebElement radiomale=driver.findElement(By.xpath("//*[starts-with(@name,'gender')]"));
			radiomale.click();

//Country	
			dropdown =driver.findElement(By.xpath("//*[starts-with(@name,'country')]"));
			Select country= new Select(dropdown);
			country.selectByVisibleText("India");
					
//City		
			dropdown =driver.findElement(By.xpath("//*[starts-with(@name,'city')]"));
			Select city= new Select(dropdown);
			city.selectByVisibleText("Nagpur");
		/*
			try
			{
				Thread.sleep(10000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}	
		*/	
			Alert alert=driver.switchTo().alert();
			
			System.out.println("Text present on alert window is:" +alert.getText());
			alert.accept();
			
//create my account
			driver.findElement(By.id("Register")).click();
			
			//driver.close();
		
	}
	
	public static void main(String[] args) 
	{
		REDIFF obj=new REDIFF();
		obj.starts();
		
	}
	
	
}
