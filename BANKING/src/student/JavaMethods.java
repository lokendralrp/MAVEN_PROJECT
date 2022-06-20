package student;

public class JavaMethods 
{

int x=20, y=30;
	
	void sum()//case 1- not taking parameters & not returned any value.
	{
		System.out.println(x+y);
	}
	
	
	int subtract()//case 2- not taking parameters BUT returning value.
	{
		return(y-x);
	}
	
	
	void sum(int a, int b)//case 3- taking parameters & not returned any value.
	{
		System.out.println(a+b);
	}
	
	
	int subtract(int x, int y)//case 4- taking parameters & also returning value.
	{
		return (x-y);
	}
	

	
	
	
	public static void main(String[] args) {
		
		JavaMethods cal=new JavaMethods();
//case 1
		cal.sum();
		
//case 2
		int res=cal.subtract();
		System.out.println(res);
// or other way of case 2		
		System.out.println(cal.subtract());
		
//case 3		
		cal.sum(100,200);
		
//case 4
		System.out.println(cal.subtract(100,200));
		
	}
}
