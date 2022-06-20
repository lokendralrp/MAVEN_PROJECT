package basics;

//static block executes automatically when the class
//is loaded in the memory.(without creating object)
//it executes before main method...

public class STATIC_BLOCK 
{
	static int a;
	final static int b;		//final static variable only initialize in static block.
	final int c;
	
	static			 
	{				
		a=10;
		b=20;
		//c=30;
		System.out.println(a);
		System.out.println("hello" +b);
	}
	
	STATIC_BLOCK ()
	{
		a=100;
		//b=200;				//we cant initialize final static variable except static block (created above)
		c=300;
		System.out.println(a);
	}

	public void show()
	{
		a=111;
		//c=121;
		System.out.println(a);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		STATIC_BLOCK sb=new STATIC_BLOCK();
		sb.show();
		System.out.println(a);
		
	}
	
	
}
