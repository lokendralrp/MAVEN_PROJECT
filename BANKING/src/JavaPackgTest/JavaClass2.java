package JavaPackgTest;

import javaPackage.JavaClass;

import JavaPackgTest.JavaClass1;

public class JavaClass2 
{
	public static void main(String[] args) 
	{
		JavaClass jc=new JavaClass();
		jc.year();
		jc.month();
		
		System.out.println('\n');
		
		//JavaClass1 jc1=new JavaClass1();
		JavaClass1.main(null);
		
	}
	

}
