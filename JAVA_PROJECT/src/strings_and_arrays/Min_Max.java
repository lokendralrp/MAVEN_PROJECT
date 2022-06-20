package strings_and_arrays;
import java.util.Scanner;

public class Min_Max 
{
	int a[];	Scanner sc;
	
	public void addvalue()
	{
		sc=new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
	    int size=sc.nextInt();
	    a=new int [size];
	    
	    System.out.println("enter " +size +" values in this array");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
	public void findMin()
	{
		int min=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}System.out.println("minimum value is " +min);
	}
	
	
	public void findMax()
	{
		int max=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}System.out.println("maximum value is " +max);
	}
	
	
	public void minMax()
	{
		int x[]= {10, 15, 5, 20, 25, 12, 17};
		int min=x[0];
		int max=x[0];
		
		for(int i=0; i<x.length; i++)
		{
			if(x[i]<min)
			{
				min=x[i];
			}
			else if(x[i]>max)
			{
				max=x[i];
			}
		}
		System.out.println("minimun value= " +min);
		System.out.println("maximum value= " +max);
		System.out.println(a.length);
	}
	
	
	public static void main(String[] args) 
	{
		Min_Max mm=new Min_Max();
		mm.addvalue();
		mm.findMin();
		System.out.println('\n');
		mm.findMax();
		System.out.println('\n');
		mm.minMax();
		
	}
}
