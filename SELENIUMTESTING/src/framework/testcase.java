package framework;


import java.util.ArrayList;

import org.testng.annotations.Test;

public class testcase extends utility
{
	objectrepository objr=new objectrepository();
	
	
	
	
	
	
	@Test(priority=1)
	public void ititbrowser()
	{
		driverSetting();
	}
	
	@Test(priority=2)
	public void navigate()
	{	
		//driver.findElement(objr.emailtxtbox).sendKeys("arman");	
		elementfinder(objr.emailtxtbox).sendKeys("testing");
		
		driver.findElement(objr.password).sendKeys("amaal");
		
		
	}

}
