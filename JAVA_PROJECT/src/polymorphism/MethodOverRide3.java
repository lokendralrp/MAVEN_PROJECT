package polymorphism;

//ACCESS MODIFIER restrictions in decreasing order
// private> default > protected> public
//child class method must be less restrictive

//**** PRIVATE METHOD CANT ACCESS HERE


class Parent
{
	void show()
	{
		System.out.println("parent- access modifier default");
	}
}

class Siblings extends Parent
{
	protected void show()
	{
		System.out.println("Grand parent- access modifier protected");
	}
}

class Child extends Siblings
{
	public void show()
	{
		System.out.println("child- access modifier public");
	}
}	

public class MethodOverRide3 
{
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		p.show();
		
		Siblings s= new Siblings();
		s.show();
		
		Child c= new Child();
		c.show();
		
		
	}

}
