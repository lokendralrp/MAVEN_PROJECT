package com.MAVEN_PROJECT.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MAVEN_PROJECT.pageobjects.LoginPage;
import com.MAVEN_PROJECT.utilities.XLUtils;


public class TC_LoginDDT_002 extends BaseClass
{
	@Test(dataProvider = "LoginData")
	public void loginTest(String uname, String pwd )
	{
		driver.get(URL);
		logger.info("URL opened....");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(uname);
		logger.info("Email inserted");
		lp.setPassword(pwd);
		logger.info("Password inserted");
		lp.clickBtnLogin();
		logger.info("Login button clicked");
		
		if(driver.getTitle().equals("Dashboard / nopCommerce administration"))
		{
			Assert.assertTrue(true);
			logger.info("Login Successfull");
			lp.clickBtnLogout();
			logger.info("Logout Successfull");
		}
		else
		{
			Assert.assertTrue(false,"Login Failed");
			logger.info("Login Failed");
		}
	 }
	
	@DataProvider(name = "LoginData")
	public Object[][] getData() throws Exception
	{
		String path = System.getProperty("user.dir")+"/src/test/java/com/MAVEN_PROJECT/testData/LoginData.xlsx";
		int rowcnt = XLUtils.getRowCount(path, "Sheet1");
		int cellcnt = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String loginData[][] = new String[rowcnt][cellcnt];
		for (int r = 1; r <= rowcnt; r++)
		{
			for (int c = 0; c < cellcnt; c++)
			{
				loginData[r-1][c] = XLUtils.getCellData(path, "Sheet1", r, c);
			}
		}
		return loginData;
	}
}
