package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

//AFTER RUN THIS TEST CASE, GO TO WORKSPACE- CLICK ON PROJECT: LOG FOLDER- U GET FILES AND LOG REPORT

public class LOG4J_demo 
{
	static Logger logger;
	
	@Test(priority=1)
	public void driverSetting()
	{
	logger=Logger.getLogger("LOG4J_demo");  // Provide test/class name as a parameter
	PropertyConfigurator.configure("Log4j.properties");
	
	logger.info("Setup method is started");
	logger.info("Setup method is in progress");
	
	//Add configuration steps
	System.out.println("This is setup method");
	}
	
	@Test(priority=2)
	public void login()
	{
		logger.info("login is started");
		//Write webdriver code
		System.out.println(" This is login test");
		logger.info("login is in progress");
		logger.info("login is completed");
		logger.info("login is passed");		
	}
	
	
	@Test(priority=3)
	public void logout()
	{
		//Write webdriver code
		System.out.println(" This is logout test");
		logger.info("logout is completed");
	}

	
}
