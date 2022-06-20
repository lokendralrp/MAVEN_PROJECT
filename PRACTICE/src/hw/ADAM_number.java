package hw;

import java.util.Scanner;

public class ADAM_number 
{
	static int reverseDigits(int num)
	{
		int rev=0; int rem=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	
	static int square(int num)
	{
		return num*num;
	}
	
	static boolean isAdamNumber(int num)
	{
		int a=square(num);
		int b=square(reverseDigits( num));
		
		if(a==reverseDigits(b))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no.");
		int num=sc.nextInt();
		if(isAdamNumber(num))
			System.out.println(num +" is ADAM no.");
		else
			System.out.println("it is not an ADAM no.");
	}

}
