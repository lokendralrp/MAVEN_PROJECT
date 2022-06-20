package inheritance;

interface ABC
{
	int x=100;			//variable: static and final
	void m1();			//abstract method
}

interface XYZ
{
	int y=200;
	void m2();
}

public class MultipleINheritance implements ABC,XYZ
{
	public void m1()			//public is must & 
	{							// must call all abstract method
		System.out.println(x);
	}
	
	public void m2()
	{
		System.out.println(y);
	}
	
	
	public static void main(String[] args) 
	{
		MultipleINheritance mi= new MultipleINheritance();
		mi.m1();
		mi.m2();
		
//create objects using INTERFACE
		System.out.println("creating objects using INTERFACE");
		System.out.println("(INTERFACE_NAME) (OBJECT_NAME)=NEW (CLASS_NAME)();");
		
		ABC abc =new MultipleINheritance();
		abc.m1();
		XYZ xyz = new MultipleINheritance();
		xyz.m2();
	}

}
