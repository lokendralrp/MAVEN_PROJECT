package javaPackage;

import JavaPackgTest.JavaClass1;

public class JavaClasses 
{
	public void week()		//only public method will be accessed outside the package
	{
		System.out.println("this is 1st week");
	}
	
	void days()
	{
		System.out.println("this is tuesday");
	}
	
	
	
	public static void main(String[] args) 
	{
		//JavaClass1 jc1=new JavaClass1();
		JavaClass1.main(null);
		
	}
	

}
