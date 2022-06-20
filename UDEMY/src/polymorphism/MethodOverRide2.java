package polymorphism;

//different return type
class Fat
{
	Object show(String a)
	{
		System.out.println("parent- return type object");
		return (a);
	}
}

class Thin extends Fat
{
	String show(String a)
	{
		System.out.println("child- return type string");
		return a;
	}
}


class Big
{
	int sum(int a, int b)
	{
		System.out.println("parent- return type BIG");
		return (a+b);
	}
}

class Small extends Big
{
	int sum(int a, int b)
	{
		System.out.println("child- return type SMALL");
		return (a+b);
	}
}



public class MethodOverRide2 
{
	public static void main(String[] args) 
	{
		Fat f=new Fat();
		System.out.println(f.show("naman"));
		
		Thin t=new Thin();
		System.out.println(t.show("raman"));
		
		Big b=new Big();
		System.out.println(b.sum(10, 20));
		
		Small s=new Small();
		System.out.println(s.sum(50, 200));
		
	}

}
