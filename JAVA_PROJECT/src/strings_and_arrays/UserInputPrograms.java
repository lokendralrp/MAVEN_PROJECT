package strings_and_arrays;

import java.util.Scanner;

public class UserInputPrograms 
{
	Scanner sc;
	String original, reverse;
	char ch[];
	
	public void reverse()
	{
		sc=new Scanner(System.in);
		System.out.println("enter the original String");
		original=sc.nextLine();
		reverse="";
		ch=original.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--)
		{
			reverse=reverse+ch[i];
		}
		System.out.println("original string = " +original);
		System.out.println("reversed string = " +reverse);
	}
	
	
	
	public static void main(String[] args) 
	{
		UserInputPrograms ui=new UserInputPrograms();
		ui.reverse();
		
	}

}
