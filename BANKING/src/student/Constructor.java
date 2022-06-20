package student;

public class Constructor //2 TYPES
{
	int x,y, u,v;

	//TYPE1- DEFAULT CONSTRUCTOR	
	Constructor() 
	{
		x=10; y=20;
	}
	void display()
	{
		System.out.println(x+y);
	}

//TYPE2- parameterized CONSTRUCTOR	
	Constructor(int a, int b)
	{
		u=a; v=b;
	}
	void result()
	{
		System.out.println(u+v);
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		Constructor cr=new Constructor();			//TYPE 1
		cr.display();	
		
		Constructor cr1= new Constructor(100,200);		//type 2
		cr1.result();
		
		Constructor cr2= new Constructor(70,80);
		cr2.result();
		
		
	
		
	}
	
}

