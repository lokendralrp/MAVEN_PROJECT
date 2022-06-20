package hw;
import java.util.*;
public class PALINDROME 
{	
	public void checkPalindrome()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("let's check, this is palindrome no. or not");
		int num, rev=0, rem, temp;
		
		System.out.println("ENTER ANY NUMBER");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}	
		System.out.println("no. after reverse: " +rev);
		if(temp==rev)
			System.out.println("PALINDROME NUMBER");
		else
			System.out.println("not PALINDROME");
		//sc.close();
	}
	
	
	void countPalindrome()
	{
		System.out.println("let's count palindrome no.");
		int limit, temp, rem, count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		limit=sc.nextInt();
		
		System.out.println("these are Palindrome Number upto " +limit);
		for(int i=1; i<=limit; i++)
		{
		   int rev=0;			//those no. which will initialise every time, those should be taken inside block.
		    temp=i;
			while(temp>0)
			{
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(i==rev)
			{
				System.out.println(i +" ---- " +rev);
				count++;
			}		
		}	
		System.out.println("these are total " +count +" in numbers");
		sc.close();
	}


	public static void main(String[] args) 
	{
		PALINDROME pd= new PALINDROME();
		pd.checkPalindrome();				System.out.print('\n');
		
		System.out.println("-----------------------------------");
		
		pd.countPalindrome();
	}

}
