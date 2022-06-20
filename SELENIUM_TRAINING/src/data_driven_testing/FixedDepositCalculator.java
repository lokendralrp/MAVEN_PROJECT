package data_driven_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositCalculator 
{
	WebDriver driver;	
	@SuppressWarnings("deprecation")
	
	public void driverSettings()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
	}
	
	public void calculateinterest() throws Exception
	{
		String path= "C://JAVA//selenium//setup//TEST EXCEL/FixedDepositCalculator.xlsx";
		
		XLUTILS.setExcelFile(path, "Sheet1");
		
		int rowcount=XLUTILS.getRowCount(path, "Sheet1");
		
		for(int i=1;i<=rowcount;i++)
		{
			int principle=Integer.parseInt(XLUTILS.getCellData(path, "Sheet1", i, 0));
			int rate=Integer.parseInt(XLUTILS.getCellData(path, "Sheet1", i, 1));
			
			int period= Integer.parseInt(XLUTILS.getCellData(path,"Sheet1",i, 2));
			String frequency=XLUTILS.getCellData(path, "Sheet1", i,3);
			double exp_mvalue=Double.parseDouble(XLUTILS.getCellData(path,"Sheet1",i,4));
			
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(principle));
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(rate));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(period));
			
			Select perioddrp=new Select(driver.findElement(By.id("tenurePeriod")));
			perioddrp.selectByVisibleText("year(s)");
			
			Select frequencydrp=new Select(driver.findElement(By.id("frequency")));
			frequencydrp.selectByVisibleText(frequency);
			
			driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[1]/img")).click();
			
			String act_mvalue=driver.findElement(By.xpath("//*[@id='resp_matval']/strong")).getText();
			
			if(exp_mvalue==Double.parseDouble(act_mvalue))
			{
				System.out.println("test passed");
			}
			else
			{
				System.out.println("test failed");
			}
			
			driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[2]/img")).click(); // clear button
			
			Thread.sleep(3000);
			
		}	
	}
	
	public static void main(String[] args) throws Exception 
	{
		FixedDepositCalculator fdc=new FixedDepositCalculator ();
		fdc.driverSettings();
		fdc.calculateinterest();		
	}

}
