package polymorphism;

//EXCEPTION HANDLING
//RULE 1: parent class doesnt throw any exception, then child class only throws unchecked exception.

class Major
{ 
	void show()
	{
		System.out.println("parent class method: doesnt throws exception");
	}
}

class Minor extends Major
{ 
	void show() throws ArithmeticException
	{
		System.out.println("child class method: throws unchecked exception");
	}
}

//rule 2: if parent class/ super class method throws Exception then child/sub class method 
//       only throw same or subclass exception
// also there is no issue if sub class method is not throwing any exception

class Bigger
{ 
	void show() throws RuntimeException
	{
		System.out.println("parent class method: throws Runtime  exception");
	}
}


class Smaller extends Bigger
{ 
	void show() throws RuntimeException
//OR	
//	void show() throws ArithmeticException
//or
//	void show()	
	{
		System.out.println("child class method: can throw same or sub-class exception");
	}
}



public class MethodOverRide4 
{

	public static void main(String[] args) 
	{
		Major m=new Major();
		m.show();
		
		Minor mi=new Minor();
		mi.show();
	
		Bigger b=new Bigger();
		b.show();
		
		Smaller s=new Smaller();
		s.show();
		
	}
}
