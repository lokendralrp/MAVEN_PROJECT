package hw;
import java.util.Scanner;  

public class FIND_ARMSSTRONG 
{
	boolean armstrongs(int num) 
	{
		int temp, digits=0, sum=0, rem=0;
		//n=153;
		temp=num;
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		temp=num;
		while(temp>0)
		{
			int product=1;
			rem=temp%10;
			for(int i=1; i<=digits; i++)
			{
				product=product*rem;
			}
			sum=sum+product;
			temp=temp/10;
		}
		if(sum==num)
		{
			return true;
		}
		else
			return false;		
	}
	
	void howmany()
	{
		{
			int count=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the limit");
			int num=sc.nextInt();
			
			System.out.println("ARMSTRONG NUMBER up to " +num +" are ");
			for(int j=1; j<=num; j++)
			{
				if(armstrongs(j))
				{
					System.out.println(j);
					count++;
				}
			}	System.out.println("total armstrongs are " +count);
			sc.close();
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		FIND_ARMSSTRONG fa=new FIND_ARMSSTRONG();
		fa.armstrongs(370);
		System.out.println("370 is armstrong number - " +fa.armstrongs(370));
				
		System.out.println('\n');
	
		fa.howmany();
	}
}
