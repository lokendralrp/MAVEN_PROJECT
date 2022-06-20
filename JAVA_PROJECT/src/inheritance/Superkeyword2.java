package inheritance;

//super keyword can be used to invoke immediate parent class 
class Animals
{
	void eating()
	{
		System.out.println("eating--------");
	}
	void m1()
	{
		System.out.println("-----parent class--------m1");
	}
}

class Dogs extends Animals
{
	void eating()
	{
		super.eating();
		System.out.println("dog is eating");
	}
	void m2()
	{
		System.out.println("child class-----m2");
	}
	void show()
	{
		System.out.println("------------show method");
		m2();
		eating();
		super.m1();
	}
}





public class Superkeyword2 
{
	public static void main(String[] args) 
	{
		Dogs dg=new Dogs();
		dg.eating();		System.out.println('\n');
		
		dg.m2();			System.out.println('\n');
		
		dg.show();			System.out.println('\n');
		
	}

}
