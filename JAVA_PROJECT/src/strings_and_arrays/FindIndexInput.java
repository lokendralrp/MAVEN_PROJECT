package strings_and_arrays;

import java.util.*;

public class FindIndexInput 
{
	int a[];
	Scanner sc;
	
	public void addval()
	{
		sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =sc.nextInt();
		a=new int[size];
		System.out.println("enter " +size +" values");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
	public void findIndex()
	{
		System.out.println("enter the value of which find index");
		
		int num=sc.nextInt();
		
			for(int i=0; i<a.length; i++)
			{
				if(a[i]==num)
				{
					System.out.println(i);
				}
			}
	}
	
	public void stringindex()
	{
		String s[]= {"aaaa","bbbb","cccc","dddd","eeee"};
		
		System.out.println("enter string of which find index");
		String x=sc.next();
		
		for(int i=0; i<s.length; i++)
		{
			if(s[i].equals(x))
			{
				System.out.println("string index= " +i);
			}
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		FindIndexInput fi=new FindIndexInput();
		fi.addval();
		fi.findIndex();
		
		fi.stringindex();
	}

}
