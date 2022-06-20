package lokendrap;

/*
 * DYNAMIC BINDING: if method is overridden then- only child class method will call.
 * if there is no overriding then- we can call only (all) parent class method as well. 
 * 
 *  only that child method can invoke which is overridden.
 * 
 * let's see bhim method of child class C- it cant be invoked through dynamic binding, coz
 * 			bhim method is not present in any of parent class...
 */

/*
 * TIGHT COUPLING: firstly class A have only epay(),  ebanking() methods, B extends A
 * 			if we create parameterised constructor A, then we will get an error in class B,
 * 		so we created non parameterised constructor in A...
 */

class A
{
	A(){}
	A(String app){}
	
	void epay()
	{
		System.out.println("inside parent class epay method");
	}
	void ebanking()
	{
		System.out.println("inside parent class ebanking method");
	}
}

class B extends A
{
	void epay()
	{
		System.out.println("inside B class epay method");
	}
	void paytm()
	{
		System.out.println("inside B class paytm method");
	}
}

class C extends B
{
	void epay()
	{
		System.out.println("inside C class epay method");
	}
	void bhim()
	{
		System.out.println("inside C class bhim method");
	}
}

public class TIGHT_COUPLING 
{
	public static void main(String[] args) 
	{
		A a= new A();	a.ebanking();		a.epay();						
		
		B b=new B();	b.ebanking();	b.epay();	b.paytm();   
		
		C c=new C();		c.ebanking();		c.paytm();		c.epay();  	 c.bhim(); 	
		
		A ab=new B();	ab.ebanking();  	ab.epay(); 		
		
		A ac=new C();		ac.ebanking(); 	ac.epay(); 	
		
		B bc=new C();		bc.ebanking();  	bc.epay(); 		bc.paytm(); 
		
	}
}
