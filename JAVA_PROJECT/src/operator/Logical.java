package operator;

public class Logical 
{
	public static void main (String[] args)
/*	
	x&&y; logical and; returns true if both true
	x||Y; logical or; returns true if one of them is true
	!(x&&y); logical not; reverse the result
*/	
	{
		int a=15, b=25, c=35;				
		System.out.println("&& LOGICAL AND");									//logical and
		System.out.println(a<b && b<c);			//true && true
		System.out.println(a<b && b>c);
		System.out.println(a>b && b<c);
		System.out.println(a>b && b>c);
		
		System.out.println('\n');	
											//logical or
		System.out.println("LOGICAL OR ||");
		System.out.println(a<b || b<c);			//true|| true
		System.out.println(a<b || b>c);			//T||F
		System.out.println(a>b || b<c);			//F||T
		System.out.println(a>b || b>c);
		
		System.out.println('\n');	
											//logical not
		System.out.println("LOGICAL NOT !");
		System.out.println(!(a<b && b<c));		//!(15<25 && 25<<35)= !(true && true)= !(true)= false
		System.out.println(!(a<b && b>c));
		System.out.println(!(a>b && b<c));
		System.out.println(!(a>b && b>c));
		
		System.out.println('\n');
		
		System.out.println(!(a<b || b<c));			
		System.out.println(!(a<b || b>c));			
		System.out.println(!(a>b || b<c));			
		System.out.println(!(a>b || b>c));
	}

}
