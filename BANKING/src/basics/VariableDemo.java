package basics;

public class VariableDemo 
{

	int b=20, c=30;				//instance variable'b,c'- use anywhere in class..
	static int f=40;		//static variable 'f'--no need to create object to call it
	
	public void localVariableMethod()
	{
		System.out.println("local variable method");
		//static int d=10;				//we cant make a local variable 'a' as static
		int a=10; 
		b=30;
		f=50;
		System.out.println("local variable a= "+a);
		System.out.println("change value for b= "+b);
		System.out.println("f = " +f);
	}
	
	public void show(int e)
	{
		System.out.println("show method e= " +e);
		System.out.println("b= " +b);
		System.out.println("e = " +e);
		System.out.println("f= " +f);
	}
	
	public void test()
	{
		System.out.println("test method");
		//a=20;					//a is local variable, so we cant change its value in other block
		f=60; b=40;
		System.out.println("b= " +b);
		System.out.println("c= " +c);
		System.out.println("f= " +f);
		//System.out.println(e);		//e is local variable of show method, we cant use it in other block
	}
	
	
	
	public static void main(String args[])
	
	{	
		VariableDemo check = new VariableDemo();
	
		check.localVariableMethod();			System.out.println('\n');
		
		check.show(50);			System.out.println('\n');
		
		check.test();			System.out.println('\n');
		
		check.show(30);			System.out.println('\n');
	
		System.out.println("b= "+check.b);			System.out.println('\n');
		
		System.out.println("f= " +f);				System.out.println('\n');
		
		
		VariableDemo check1 = new VariableDemo();
		check1.b=100;
		check1.f=150;
		System.out.println(check.f);		//f=60
		
		
		VariableDemo check2 = new VariableDemo();
		check2.b=200;
		check2.f=250;
		
		System.out.println(check1.b);				//b=100
		System.out.println(check2.b);			//b=200
		System.out.println(check1.f);				//150
		System.out.println(check.f);	
	}
}
