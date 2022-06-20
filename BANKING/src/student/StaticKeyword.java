package student;

public class StaticKeyword 
{
	static int a=10, 	count=0;
	int b=20;
	
	static void m1()			//STATIC METHODS CAN ACCESS STATIC STUFF DIRECTLY
	{
		System.out.println("this is static method-------m1");
	}
	
	void m2()					//STATIC METHODS CAN ACCESS NON STATIC STUFF THROUGH OBJECT
	{
		System.out.println("this is non-static method------m2");
	}
	
	void m3()				//NON STATIC METHODS CAN ACCESS BOTH ST. & NON-ST. STUFF DIRECTLY
	{
		System.out.println("this is also non-static method-------m3");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	static void cd()	//counter-demo
	{
		count++;
		System.out.println(count);
	}
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("static variable " +a);
		m1();											//static method
		
		StaticKeyword sk=new StaticKeyword();					//non static method
		System.out.println("non static variable " +sk.b);			
		sk.m2();
		
		System.out.println('\n');
		sk.m3();
		
		System.out.println( '\n' +"counter demo through method");
		cd();
		cd();
		cd();
		
		System.out.println( '\n' +"counter demo directly");
		System.out.println(count++);
		System.out.println(count++);
		System.out.println(count++);
		
	}

}
