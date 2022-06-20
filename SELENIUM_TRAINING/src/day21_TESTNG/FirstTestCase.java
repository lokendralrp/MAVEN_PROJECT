package day21_TESTNG;

import org.testng.annotations.Test;

public class FirstTestCase 
{
	@Test(priority=10)
	void login()
	{
		System.out.println("this is login method");
	}

	@Test(priority=15)
	void logout()
	{
		System.out.println("this is logout method");
	}
	
	@Test(priority=5)
	void openurl()
	{
		System.out.println("this is openurl method");
	}
}
