package hw;
import java.util.Scanner;
public class FactSqCube 
{
   static void fact()
	{
		int num=1;
		for(int n=5; n>=1; n--)
		{
			num=num*n ;
		}System.out.println("factorial= " +num);
	}

	static void square()
	{
		int num = 5;
		int sq=num*num;
		System.out.println("SQUARE = " +sq);
	}
	
	static void cube()
	{
		int num = 5;
		int cu=num*num*num;
		System.out.println("CUBE = " +cu);
	}
	
	
	public static void main(String[] args) 
	{
		char input;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER F / S / C");
		input= sc.next().charAt(0);
		
		switch(input)
		{
		case 'f': fact(); break;
		case 's': square();break;
		case 'c': cube();break;
		default :System.out.println("INVALID");
		
		}
	}
}