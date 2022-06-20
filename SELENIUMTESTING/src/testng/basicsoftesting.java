package testng;

import org.testng.annotations.Test;

public class basicsoftesting 
{
	@Test(priority=2, groups= {"chatlist"})
	public void testmethod1()
	{
		System.out.println("welcome to test 1");
	}

	@Test(priority=3, groups= {"settings"})
	public void testmethod2()
	{
		System.out.println("welcome to test 2");
	}

	@Test(priority=1, groups= {"chatlist", "settings"})
	public void testmethod3()
	{
		System.out.println("welcome to test 3");
	}

}
