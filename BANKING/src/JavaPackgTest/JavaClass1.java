package JavaPackgTest;

import javaPackage.*;

public class JavaClass1 
{
	public static void main(String[] args) 
	{
		JavaClass jc=new JavaClass();
		jc.year();
		jc.month();
		
		JavaClasses jcs= new JavaClasses();
		jcs.week();
		//jc.days();			--this is default method, so cant access outside pckg
		
	}

}
