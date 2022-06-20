package framework;

import java.util.ArrayList;
import org.testng.annotations.Test;

public class testcase2 extends utility
{
	objectrepository objr=new objectrepository ();
	
	ArrayList<String> username= dataread("C:\\JAVA\\selenium\\setup\\TEST EXCEL\\testfile.xlsx", "Sheet1", 0);
	ArrayList<String> password= dataread("C:\\JAVA\\selenium\\setup\\TEST EXCEL\\testfile.xlsx", "Sheet1", 1);
	
	@Test(priority=1)
	public void initbrowser()
	{
		driverSetting();
	}
	
	@Test(priority=2)
	public void test()
	{
		for(int i=0; i<username.size(); i++)
		{
			elementfinder(objr.emailtxtbox).sendKeys(username.get(i));
			//elementfinder(objr.password).sendKeys(password.get(i));

			elementfinder(objr.password).sendKeys("password.get(i)");
			
			elementfinder(objr.emailtxtbox).clear();
			elementfinder(objr.password).clear();
		}
	}

}
