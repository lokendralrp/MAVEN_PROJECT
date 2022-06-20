package flow_control;

public class Whileloop 
{

	int i=1, sum=0, j=0, k=10, dec=0, l=1;
	
	public void first()
	{
		while(i<=5)
		{ 
			System.out.println(i);
			i++;
		}
	}
	
	public void summation()		//sum=0, j=2
	{
		while (j<=10)
		{
			sum = sum + j;
			j++;
			System.out.println(l++ +". sum= "+sum +" + "+j +" == " +(sum+j));
		}	
	}
	
	public void countdigits()
	{ 
		long n=9685841707l, count=0;
		
		while(n>0)
		{
			n=n/10;
			count++;
			//System.out.print(count +" ");
			//System.out.println(n);
		}
		System.out.print("no. of digits in 9685841707 = ");
		System.out.println(count);
	}
	
	
	
	/*public void substraction()		//k=0, dec=10; 
	{
		while (k<=0)
		{
			dec = dec-k;
			k--;
			System.out.println("substraction: " + dec);
		}
		
	}
	*/
	public static void main(String[] args) {
		
		Whileloop demo = new Whileloop();
		demo.first();
		System.out.println();
		
		demo.summation();
		System.out.println();
		
		//demo.substraction();
		
		demo.countdigits();
		
		//demo.sum();
	}
}
