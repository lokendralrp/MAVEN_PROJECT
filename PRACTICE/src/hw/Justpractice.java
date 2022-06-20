package hw;

import java.util.Scanner;

public class Justpractice 
{//ternary operator
	 int febdays;
	void ternary()		//odd using ternary
	{
		String output=(10%2==0)?"even no":"odd no";
		System.out.println(output +"......");
		
		
		String output1=(febdays==29)?"leap year":"not a leap year";
		System.out.println(output1 +"......");
	}
	
	void Primeno()		//prime using for & if else
	{
		int n=7, count=0; 
		int a;
		for(a=1; a<=n; a++)
		{
			if(n%a==0)
			count++;
		}
		if (count==2)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("non prime");
		}
	}
		
	void fibonacci()
	{
		int a=0,b=1, c;
		
		System.out.print(a);
		
		for(int i=1; i<=10; i++)
		{
			c=a+b;
			System.out.print(" _ " +c);
			a=b;
			b=c;
		}
	}
	
	void assign2a()
	{
		System.out.println("QUESTION 2:SWAP WITHOUT 3RD VARIABLE");
		int a=6, b=8;
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping");
		System.out.println("a= " +a);
		System.out.println("b= " +b);	
	}
	
	
	//odd no. till 10 and their sum
		void assign4()		
		{
			System.out.println("QUESTION 4");
			int total=0;
			for(int i=1; i<=10; i++)
			{
				if(i%2!=0)
				{
					total=total+i;
					System.out.print(i +" ");
					//System.out.println(total);
				}	
			}System.out.println(" and their sum= " +total);
		}
		
	void odd()		//odd no. using for & continue
	{
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
				continue;
				System.out.print(i +" ");
		}
	}
	
	void oddwhile()		//odd no. using while & continue
	{
		int i=1;
		while(i<=20)
		{
			if(i%2==0)
			{
				i++;
				continue;				
			}		
			System.out.print(i +" ");
			i++;
		}
	}
	
	void table5()
	{
		int i=1, n=1;
		do
		{
			if(i%5!=0)
			{
				i++;
				continue;
			}
			System.out.println(5 +" * " +(n++) +" =  " +i);
			i++;
		}while(i<=50);
	}
	
	void table15()
	{	int t=15;
		for(int i=1; i<=5; i++)
		{
			System.out.println(t +" * " +i +" = " +(t*i));
		}
	}
	
	void nestedfor()
	{
		System.out.println();
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				if(i==j)
					continue;
				System.out.println(i +" " +j);
			}
		}
	}
	
	void countdigits()
	{
		long n=9685841707l, count=0;
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("no. of digits in 9685841707=  " +count);
	}
	
	void findgreater()
	{
		int a=10, b=20, c=30;
		if(a>b && a>c)
			System.out.println("a is greater");
		else if(b>a && b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");
	}
	
	
	void assign3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any value");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("Vowel"); 
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println("Consonant");
		else
			System.out.println("ERROR");		
	}
	
	
	public static void main(String[] args) 
	{
		new Justpractice().ternary();			System.out.println("\n");
		
		new Justpractice().Primeno();			System.out.println("\n");
		
		new Justpractice().fibonacci();			System.out.println("\n");
		
		new Justpractice().assign2a();			System.out.println("\n");
		
		new Justpractice().assign4();			System.out.println("\n");
		
		new Justpractice().odd();			System.out.println("\n");
	
		new Justpractice().oddwhile();			System.out.println("\n");
		
		new Justpractice().table5();			System.out.println("\n");
		
		new Justpractice().table15();			System.out.println("\n");
		
		new Justpractice().nestedfor();			System.out.println("\n");
		
		new Justpractice().countdigits();			System.out.println("\n");
		//Justpractice jp8=new Justpractice();
		//jp8.findgreater();	System.out.println("\n");
		
		new Justpractice().findgreater();			System.out.println("\n");
		
		new Justpractice().assign3();			System.out.println("\n");
	}
}
