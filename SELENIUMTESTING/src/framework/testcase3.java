package framework;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class testcase3 extends utility
{
	objectrepository objr=new objectrepository ();
	
	@Test(priority=1)
	public void initbrowser()
	{
		driverSetting();
	}
	
	@Test(priority=2)
	public void alerttest()
	{
		String expectedresult="test message";
		starttestcase("Alert Testing");
		
		markstatus("info", "navigate to website successfully");				
		elementfinder(objr.rediffsubmitbutton).click();
		
		Alert objAlert=driver.switchTo().alert();
		markstatus("info", "alert generated successfully");
		
		String actualresult = objAlert.getText();
		objAlert.dismiss();
		driver.switchTo().defaultContent();
		markstatus("info", "alert dismissed successfully");
		
		if(expectedresult.equals(actualresult))
		{
			markstatus("pass", "alert text message displayed successfully");
		}
		else 
		{
			markstatus("fail", "alert text message mismatch");			
		}
		
		
	}

}
