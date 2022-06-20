package data_driven_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleInterstCalc 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\selenium\\setup\\chromedriver files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.easycalculation.com/simple-interest.php");
		
		String path = "C://JAVA//selenium//setup//TEST EXCEL//SIdata.xlsx";
		
		XLUTILS.setExcelFile(path, "Sheet1");
		
		int rowcount=XLUTILS.getRowCount(path, "Sheet1");
		
		for(int i=1; i<=rowcount; i++)
		{
			int principle=Integer.parseInt(XLUTILS.getCellData(path, "Sheet1", i, 0));
			int rateofinterest=Integer.parseInt(XLUTILS.getCellData(path, "Sheet1",i,1)); // type casting
			int time=Integer.parseInt(XLUTILS.getCellData(path, "Sheet1",i,2)); // type casting
			Double exp_si=Double.parseDouble(XLUTILS.getCellData(path, "Sheet1",i,3));
			Double finalamt=Double.parseDouble(XLUTILS.getCellData(path, "Sheet1",i,4));
			
			driver.findElement(By.name("res1")).sendKeys(String.valueOf(principle));
			driver.findElement(By.name("res2")).sendKeys(String.valueOf(rateofinterest));
			driver.findElement(By.name("res3")).sendKeys(String.valueOf(time));
			
								
			Select timedrp=new Select(driver.findElement(By.name("time")));
			timedrp.selectByVisibleText("Years");
					
			Thread.sleep(5000);
			
			String act_si=driver.findElement(By.name("res4")).getAttribute("value"); //capture Simple Interest value
			
			if(exp_si==Double.parseDouble(act_si) && finalamt==(principle+Double.parseDouble(act_si)))
			{
				System.out.println("Test Passed");
				XLUTILS.setCellData(path, "Sheet1", i, 5, "Passed");
							
			}
			else
			{
				System.out.println("Test Failed");
				XLUTILS.setCellData(path, "Sheet1", i, 5, "Failed");
			}
				
			driver.findElement(By.xpath("//*[@id='dispCalcConts']/input[2]")).click(); //reset button
					
			Thread.sleep(3000);
		}
	
	}

}
