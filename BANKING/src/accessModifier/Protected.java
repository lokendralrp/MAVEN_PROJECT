package accessModifier;

/*The protected access modifier is accessible within package and 
 * outside the package but through inheritance only.
 * 
 * The protected access modifier can be applied on the data member, method and constructor. 
 * It can't be applied on the class.
 * 
 * we will take class as public so that it can be accessed outside the class.
 */	

public class Protected 
{
	protected int d=10;
	
	protected void month()
	{
		System.out.println("this is february");
	}

}
