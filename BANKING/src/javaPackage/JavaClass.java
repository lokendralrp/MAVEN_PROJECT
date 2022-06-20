package javaPackage;

/*
 * There are three ways to access the package from outside the package.

1. import package.*;----all the classes and interfaces of this package will be accessible but not subpackages.

2. import package.classname;---- only declared class of this package will be accessible.

3. fully qualified name. ----If you use this then only declared class of this package will be accessible. 
                             Now there is no need to import. 
                             But you need to use fully qualified name every time when you are accessing the class or interface.
*/

public class JavaClass 
{
	public void year()
	{
		System.out.println("this is 2022");
	}
	
	public void month()
	{
		System.out.println("this is january");
	}

	
	
}


