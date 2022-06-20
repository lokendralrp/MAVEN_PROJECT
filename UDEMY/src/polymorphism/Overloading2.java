package polymorphism;

public class Overloading2 
{
	void show(Object a)		//CASE 2: Object class is the parent class of all class
	{
		System.out.println("this is object  " +a);
	}
	
	
	void show(int a)
	{
		System.out.println("this is method 2");
	}

	
	void show(int a, double b)
	{
		System.out.println("Method 3 " +(a+b));
	}
	
	void show(double a, int b)
	{
		System.out.println("Method 4 " +(a+b));
	}
	
	public static void main(String[] args) 
	{
		Overloading2 obj=new Overloading2();
		obj.show("lrp");				//there is no string type method, so it will call object type
											//& compiler always give preference to child class
		obj.show(20);			//ex. here we give int value, it called int type
		
		obj.show(30,30.5);
		
		obj.show(30.5,20);
		
	}
	
	
}
