package strings_and_arrays;

import java.util.Scanner;

public class StringPrograms 
{
	int sum=0;
	int b[][] = {{11,22,77}, {33,44,88}, {55,66,99}};
	
	public void borderaddition()
	{
		for(int r=0; r<b.length; r++)
		{
			for(int c=0; c<b[0].length; c++)
			{
				if(r==0||r==b.length-1||c==0||c==b[0].length-1)
				{
					//System.out.println("row= " +r +", col= " +c);
					System.out.print(sum +" + ");
					sum=sum+b[r][c];
					System.out.print(b[r][c] +" = ");	
				}
			}
		}System.out.println("sum of outer values is " +sum);
		
	}
	
	public void palindrome()
	{
		String s="madam";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("original string== "+s +";  after reverse== " +rev);
		if(s.equals(rev))
		{
			System.out.println("this is palindrome string");
		}
		else
			System.out.println("this is not palindrome string");
	}

	
	public void reverseWord()
	{
		String str="Welcome to java";
		String[] words=str.split(" ");		//splitting string into words
		String reverseString="";		
		
		for(String w:words)
		{
			String reverseword="";
			
			for(int i=w.length()-1; i>=0; i--)
			{
				reverseword=reverseword+w.charAt(i);
			}
			reverseString= reverseString+ reverseword +" ";
		}
		System.out.println(reverseString);	
	}
	
	
	
	public void maxOccurChar()
	{
		String s="geeks of geek";
		int[] a=new int[127];			//ascii code limit 127 or 256
		
		for(int i=0; i<s.length();i++)
		{
			a[s.charAt(i)]= a[s.charAt(i)] + 1;
			
		}		
		int max=0;
		char c=' ';
		
		for(int i=0; i<s.length(); i++)
		{
			if(max<a[s.charAt(i)])
			{
				max=a[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		System.out.println("MAXIMUM REPEATED CHAR= " +c);
		
	}
	
	
/*	
	public void duplicateString()
	{
		int count=0;
		
		String a[]={"two","two","two","two","three","four","five","six","seven"};
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
			
				if((a[i]==a[j]))
				{
					System.out.println(a[i]);
					count++;
				}
			}
		}
		System.out.println("no. of repeatation is " +count);
	}
*/	
	
	
	
	
	
	
	
	
	
	public void countwords()
	{
		System.out.println("ENTER THE STRING");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=1;
		
		for(int i=0; i<s.length(); i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("NO. OF WORDS IN THE STRING=  " +count);	
		sc.close();
	}
	
	
	
	
	public static void main(String[] args) 
	{
		StringPrograms sp=new StringPrograms();
		sp.borderaddition();			System.out.println('\n');
		sp.palindrome();				System.out.println('\n');
		sp.reverseWord();				System.out.println('\n');
		sp.maxOccurChar();				System.out.println('\n');
//		sp.duplicateString(); 			System.out.println('\n');
		
		
		
		sp.countwords(); 				System.out.println('\n');
		
		
	}
	
}
