package inheritance;

class A
{
	void showA(int a)
	{
		System.out.println("class A  " +a);
	}
	
	void showAA()
	{
		System.out.println("inside parent class method");
	}
}

class B extends A
{
	void showB(int b)
	{
		System.out.println("class B   " +b);
	}
}


class C extends B
{
	void showC(int c)
	{
		System.out.println("class C   " +c);
	}
}


class D extends A
{
	void showD(int d)
	{
		System.out.println("class D   " +d);
	}
}


public class Inheritance 
{
	public static void main(String[] args) 
	{
		A obj1=new A();
		System.out.println("OBJECT OF A CLASS:");
		obj1.showA(10);
	//	obj1.showB();		//error: we cant invoke child class method from parent class
		
		B obj2=new B();			//SINGLE INHERITANCE
		System.out.println("OBJECT OF B CLASS: ");
		//obj2.showA(20);
		obj2.showB(30);
		
		C obj3=new C();			//MULTILEVEL (A,B,C)
		System.out.println("OBJECT OF C CLASS: ");
		obj3.showA(40);
		obj3.showB(50);
		obj3.showC(60);
		
		D obj4=new D();			//HIERARCHICAL (A IS THE PARENT OF B & D)
		System.out.println("OBJECT OF D CLASS: ");
		obj4.showA(70);
		//obj4.showB(70);
		//obj4.showC(70);
		obj4.showD(70);
		
	}

}
