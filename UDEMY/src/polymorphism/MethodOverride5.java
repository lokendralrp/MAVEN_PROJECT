package polymorphism;

//ABSTRACT METHOD

interface I1
{
	void displays();
}

abstract class Fatter
{
	abstract void display();		//it is optional here (just for example)

	
	void show() throws RuntimeException
	{
		System.out.println("PARENT CLASS: ABSTRACT CLASS");
	}
}

class Thinner extends Fatter
{
	void display()					//if we inherit abstract class then we must override abstract method als0 if present.
	{
		
	}
	void show()
	{
		System.out.println("EXTENDS ABSTRACT CLASS");
	}
}

class Interfc implements I1
{
	public void displays()				//public should used in case of interface
	{
		
	}
	void showing()
	{
		System.out.println("IMPLEMENTS INTERFACE");
	}
}




public class MethodOverride5 
{
	public static void main(String[] args) 
	{
		//Fatter f=new Fatter();			//we cant create object of abstract class
		Thinner th=new Thinner();
		th.display();
		th.show();
		
		Interfc thi=new Interfc();
		thi.showing();
	}

}
