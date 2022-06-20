package polymorphism;

//same return type
//**OVERRIDING SUPER/PARENT/OVERRIDDEN CLASS METHOD FROM SUB CLASS
class Test
{
	int a=10;
	void show()
	{
		System.out.println("parent- show method");
	}
	void m1()
	{
		System.out.println("parent method 1");
	}
}

class Next extends Test
{
	int a=20;
	void show()
	{									//super keyword
		//a=30;
		super.show();		System.out.println(a+a);
		m1();
		//show();						//WE CAN CALL PARENT CLASS METHOD WITHOUT SUPER KEYWORD BUT
		System.out.println("child- show method");		//ONLY IF METHOD NAME IS DIFFERENT
	}
}	

//other example
class Bank
{
	double rateOfInt()
	{
		return  0;
	}
}

class SBI extends Bank
{
	double rateOfInt()
	{
		return 10.5;
	}
}

class ICICI extends Bank
{
	double rateOfInt()
	{
		return 9.7;
	}
}

public class MethodOverRide 
{

	public static void main(String[] args) 
	{
//STATIC BINDING		
		Test t=new Test();
		t.show();		System.out.println(t.a);							System.out.println('\n');
		
		Next n=new Next(); 
		n.show();	System.out.println(n.a);	//call child class variable							
																				System.out.println('\n');
		
		SBI sbi=new SBI();				
		ICICI icici=new ICICI();
		System.out.println("SBI " +sbi.rateOfInt());
		System.out.println("ICICI " +icici.rateOfInt());		System.out.println('\n');
		
//DYNAMIC BINDING: if method is overridden then only child class method will call.
		//if there is no overriding, we can call parent class method as well.
		
		Test t1= new Next();
		t1.m1();	System.out.println(t1.a);	//call parent class variable and method(coz these are not overridden)								
																	System.out.println('\n');
		t1.show();												System.out.println('\n');
		
		Bank b=new ICICI();					
		System.out.println("icici- " +b.rateOfInt());
		
		
	}
	
	
}
