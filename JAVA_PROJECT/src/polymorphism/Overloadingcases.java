package polymorphism;

public class Overloadingcases 
{
	void show(StringBuffer a)
	{
		System.out.println("StringBuffer method  " +a);
	}
	
	
	void show(String a)
	{
		System.out.println("String method  " +a);
	}

	
	void show(int... a)		//varargs
	{
		System.out.println("VAR ARGS");
	}


	public static void main(String[] args) 
	{
		Overloadingcases oc=new Overloadingcases();
	
		oc.show(new StringBuffer("method 1"));
		
		oc.show("abc");
		
		oc.show(30,40,50,50);
	}
	
}
