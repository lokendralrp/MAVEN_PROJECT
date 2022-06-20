package accessModifier;

/*
 *DEFAULT-  If you don't use any modifier, it is treated as default by default. 
 *The default modifier is accessible only within package. 
 *It cannot be accessed from outside the package.
 */

class C
{
	void msg()
	{
		System.out.println("this is default method");
	}
}


public class Default 
{
	public static void main(String[] args) 
	{
		
	}

}
