package lokendrap;

public class StaticChild extends StaticParent
{
	public static void show()
	{
		System.out.println("child class static method");
	}
	
	public void display()
	{
		System.out.println("child class non static method");
	}

	public void child()
	{
		System.out.println("child method");
	}

	public static void main(String[] args) 
	{
		StaticChild sc=new StaticChild();		//if override- then call only child class methods
		show();
		sc.display();
		sc.child();							
		sc.parent();						//call parent class method which is not overridden
		
		System.out.println('\n');
		
		StaticParent sp=new StaticParent();		//call all parent class methods
		sp.show();
		sp.display();
		sp.parent();
		
		System.out.println('\n');
		
		StaticParent stp=new StaticChild();
		stp.show();			//parent class static
		stp.display();		//if overridden- child class non static 
		stp.parent();		//not overridden parent method
		
	}
	
}