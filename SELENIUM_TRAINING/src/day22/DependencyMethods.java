package day22;

import org.testng.Assert;
import org.testng.annotations.Test;



public class DependencyMethods 
{
	@Test(priority=1)
	void openURL()
	{
		System.out.println("url opened");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods={"openURL"})
	void login()
	{
		System.out.println("login test");
		Assert.assertTrue(true);
	}
	

	@Test(priority=3,dependsOnMethods={"login"})
	void search()
	{
		System.out.println("search test");
		Assert.assertTrue(false);
	}
	
	@Test(priority=4,dependsOnMethods={"login","search"})
	void advancedsearch()
	{
		System.out.println("advanced search test");
		Assert.assertTrue(true);
	}
	
	@Test(priority=5,dependsOnMethods={"login"})
	void logout()
	{
		System.out.println("loogout test");
		Assert.assertTrue(true);
	}
}
