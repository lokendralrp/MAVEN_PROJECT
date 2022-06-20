package hw;
import java.util.Scanner;
public class Classchar 
{
	void alphabet(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		System.out.println("Entered character "+ch+" is  Vowel"); 
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			System.out.println("Entered character "+ch+" is Consonent");
		      else
			System.out.println("Not an alphabet");		
	}
	public static void main(String[ ] arg)
	{
		Classchar cc=new Classchar();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char in=sc.next( ).charAt(0);	 		
		cc.alphabet(in);
	}

}
