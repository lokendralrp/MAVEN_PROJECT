package accessModifier;

//PRIVATE - The private access modifier is accessible only within the class.
class A
{
	private int age=25;
	private void year()			
	{
		System.out.println("this is 2022");
	}
}


class B
{
	private B()
	{
		System.out.println("private constructor");
	}
}



public class Private 
{
	private int decade=2;
	private void century()
	{
		System.out.println("this is private method");
	}
	
	public static void main(String[] args) 
	{
		A obj=new A();
		//obj.year();			//error
		//System.out.println(obj.age);			//error
		
		
		//B obj = new B();				//error
	
		Private  pr =new Private ();
		pr.century();
		System.out.println(pr.decade);
	
	}
	

}
