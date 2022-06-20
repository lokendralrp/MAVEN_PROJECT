package lokendrap;

import java.util.Scanner;

class ADDITION
{
	int a,b;
	
	//ADDITION(){}
	ADDITION (int a , int b)
	{
		this.a=a;
		this.b=b;
	}
	public int addition()
	{
		return a+b;
	}
}


	
class SUBSTRACTION //extends ADDITION
{
	int a,b;
	SUBSTRACTION(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public int substraction()
	{
		return b-a;
	}
}


class MULTIPLICATION
{
	int a,b;
	MULTIPLICATION(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public int multiplication()
	{
		return a*b;
	}
}


class DIVISION
{
	int a,b;
	DIVISION(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public int division()
	{
		return b/a;
	}
}


class CALCULATOR
{
	int a,b;
	ADDITION add; SUBSTRACTION sub; MULTIPLICATION multi; DIVISION divi;
	
	CALCULATOR(){}
	
	CALCULATOR(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void addval()
	{
		add=  new ADDITION (a,b);
		System.out.println(add.addition());
	}
	
	public void subtractval()
	{
		sub=  new SUBSTRACTION (b,a);
		System.out.println(sub.substraction());
	}
	
	public void multival()
	{
		multi=  new MULTIPLICATION (a,b);
		System.out.println(multi.multiplication());
	}
	
	
	public void divival()
	{
		divi=  new DIVISION (b,a);
		System.out.println(divi.division());
	}
}


public class CALC_AGREEGATION 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER VALUE OF A");
		int a=sc.nextInt();
		System.out.println("ENTER VALUE OF B");
		int b=sc.nextInt();
		
		CALCULATOR cal = new CALCULATOR(a,b);
				
		System.out.println("ENTER add FOR ADDITION");
		System.out.println("ENTER sub FOR SUBSTRACTION");
		System.out.println("ENTER multi FOR MULTIPLICATION");
		System.out.println("ENTER divi FOR DIVISION");
		String input= sc.next();
		
		switch(input)
		{
			case "add":cal.addval(); break;
			case "sub":cal.subtractval();break;
			case "multi":cal.multival();break;
			case "divi":cal.divival();break;
			default :System.out.println("INVALID");
		}
		sc.close();
	}
}
