package hw;
//import java.util.*;

public class ARMSTRONG_NUMBER 
{
	int digits;
	int num=153;
	
	void armstrong()
	{
		int temp=num;
		while(temp>0)			//count digits
		{
			temp=temp/10;
			digits ++;
		}
		int sum=0,  rem=0;
		temp=num;
		while(temp>0)			//power of every digits by no. of digits
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
			System.out.println(sum +" - ARMSTRONG_NUMBER ");
		}
		else
		{
			System.out.println("not ARMSTRONG_NUMBER ");
		}
	}
	
	public static void main(String[] args) 
	{
		ARMSTRONG_NUMBER an= new ARMSTRONG_NUMBER();
		an.armstrong();
		System.out.println('\n');
		
		
//other trick............
		
		
		int limit = 1000, count=0; int total=0;
		System.out.println("Armstrong number between 1 and " +limit);
		for(int i=1; i<=limit; i++)
		{
			int temp, digits=0, sum=0, rem=0;
			//n=153;
			temp=i;
			
			while(temp>0)
			{
				temp=temp/10;
				digits++;
			}
			
			temp=i;
			while(temp>0)
			{
				int product=1;
				rem=temp%10;
				for(int j=1; j<=digits; j++)
				{
					product=product*rem;
				}
				sum=sum+product;
				temp=temp/10;
			}
			if(sum==i)
			{
				System.out.println(sum);
				count++;
				total=total+sum;
			}
		}
		System.out.println("there are total " +count +" armstrong no. upto " +limit );	
		System.out.println("sum of these no. are " +total);
	}

}
