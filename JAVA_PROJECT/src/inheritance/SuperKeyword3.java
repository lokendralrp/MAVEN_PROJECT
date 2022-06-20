package inheritance;
//super () can be used to invoke immediate parent class constructor

class Building
{
	Building()
	{
		System.out.println("this is building......");
	}
}


class Floor2 extends Building
{
	Floor2()
	{									//the result will same as above instead we
										// didn't calling constructor of parent class
		System.out.println("this is floor 2");			//the only difference is internal execution
	}
}


class Floor1 extends Building
{
	Floor1()
	{
		super();								//calling constructor of parent class
		System.out.println("this is floor 1");
	}
}


public class SuperKeyword3 
{
	public static void main(String[] args) 
	{
		Floor2 fl=new Floor2();
		Floor1 f=new Floor1();
		
	}

}
