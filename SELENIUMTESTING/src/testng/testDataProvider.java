package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testDataProvider 
{
	@Test(priority =1, dataProvider = "testdata")
	public void test(int id, String password, String name )
	{
		System.out.println("the is is " +id +"Password is " +password +"name is " +name);
	}
	
	@DataProvider(name ="testdata")
	public Object[][] dataprovidermethod()
	{
		return new Object[][]
				{ 
					{11, "pwd1", "name1"}, 
					{12, "pwd2", "name2"},
					{12, "pwd3", "name3"},
					{12, "pwd4", "name4"},
				};
			
	}				

}
