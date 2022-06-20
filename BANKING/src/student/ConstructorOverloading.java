package student;

public class ConstructorOverloading 
{
	ConstructorOverloading()		//we need to create no arguments default constructor  
	{								//if we create constructor and method in one class together.
		
	}
	
	ConstructorOverloading(int a, int b )
	{
		System.out.println("a+b=  " +(a+b));
	}

	ConstructorOverloading(double c, int d )
	{
		System.out.println("c+d =  " +(c+d));
	}
	
	ConstructorOverloading(int f, double e )
	{
		System.out.println("e+f=  " +(e+f));
	}
	
	ConstructorOverloading(int g, int h , int i)
	{
		System.out.println("g+h+i=  " +(g+h+i));
	}
	
	
	public void sum(int j, int k)					//we create default constructor coz of this method among constructor.
	{
		System.out.println("j+k= " +(j+k));
	}
	
	
	
	
	public static void main(String[] args) 
	{
		ConstructorOverloading co=new ConstructorOverloading(100,200);
		ConstructorOverloading co1=new ConstructorOverloading(100.200,200);
		ConstructorOverloading co2=new ConstructorOverloading(100,200.100);
		ConstructorOverloading co3=new ConstructorOverloading(100,200,300);
		
		
		ConstructorOverloading co4= new ConstructorOverloading();
		co4.sum(30, 40);
	}
	
	
	
}
