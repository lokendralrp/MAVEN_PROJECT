package lokendrap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/*
 * 1.swap- 5types
 * 2.reverse no.- StringBuffer, StringBuilder
 * 3.reverse string
 * 4.palindrome
 * 5.palindrome string
 * 6.countdigits
 * 7.count_even_odd in a number()
 * 8.sum of digits
 * 9.largest 
 * 10.fibonacci	
 * 11.primenum
 * 12.random number
 * 13.factorial
 * 14.sum of array element
 * 15.even_odd_in_array1
 * 16.reverse words in String	
 * 17.sumofarray
 * 18.evenoddarray
 * 19.Equality Of Two Arrays
 * 20.Missing Number in an Array
 * 21.Missing Number in an Array
 * 22.max and min values in array	
 * 23.duplicate elements in array	
 * 24.Searching an Element in Array
 * 25.REMOVE JUNK AND SPECIAL CHARACTER FROM STRING
 * 26.REMOVE WHITE SPACES
 * 27.How To Count occurances of a Character in a string
 * 28.count words in a string
 * 29.find vowel and consonant in string
 * 30.armstrong number
 * 31.table of 5
 * 
 * 
 */


public class PRACTICE 
{
	int a=10,b=20;
	Scanner sc;
//1	
	public void swap1()
	{		
		System.out.println("no. before swapping= " +a+"  "+b);
		
		int t=a;//t=10
		a=b;//a=20
		b=t;//b=10
		System.out.println("no. after swap= " +a +"  "+b);
	}
	
	public void swap2()
	{
		System.out.println("no. before swapping= " +a+"  "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("no. after swap= " +a +"  "+b);	
	}

	public void swap3()
	{
		System.out.println("no. before swapping= " +a+"  "+b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("no. after swap= " +a +"  "+b);	
	}
	
	public void swap4()
	{
		System.out.println("no. before swapping= " +a+"  "+b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("no. after swap= " +a +"  "+b);
	}
	
	public void swap5()
	{
		System.out.println("no. before swapping= " +a+"  "+b);
		
		b=a+b-(a=b);
		
		System.out.println("no. after swap= " +a +"  "+b);
	}

//2	
	public void reverse1()
	{
		/*sc=new Scanner(System.in);
		
		System.out.println("enter a no.");
		int num=sc.nextInt();*/
		int num=1234;
		System.out.println("no.= " +num);
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;			
		}
		System.out.println("no. after reverse= " +rev);
	}
	
	public void reverse2()
	{
		int num=1234;
		System.out.println("no.= " +num);
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		
		System.out.println("no. after reverse= " +rev);
	}
	
	public void reverse3()
	{
		int num=1234;
		System.out.println("no.= " +num);
		
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		
		System.out.println("no. after reverse= " +rev);
	}
	
//3	
	void reverseString1()//using +(string concatination) operator
	{
		String digits="abcd";
		System.out.println("string= " +digits);
		
		int len=digits.length();
		String rev="";
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+digits.charAt(i);
		}
		System.out.println("string after reverse= " +rev);		
	}
	
	void reverseString2()//using character array
	{
		String digits="lokendra";
		System.out.println("string= " +digits);
		
		char a[]= digits.toCharArray();
		int len=a.length;
		String rev="";
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		
		System.out.println("string after reverse= " +rev);		
	}
	
	void reverseString3()//using string buffer
	{
		String digits="manish";
		System.out.println("string= " +digits);
		
		StringBuffer sb=new StringBuffer(digits);
		StringBuffer rev=sb.reverse();
		
		System.out.println("string after reverse= " +rev);	
	}
	
//4	
	void palindrome()
	{
		int num=12121;
		System.out.println("no.= " +num);
		
		int rev=0, temp=num;
		while(temp!=0)
		{
			rev=rev*10+temp%10;
			temp=temp/10;
		}
		
		if(num==rev)
		{
			System.out.println("no. after reverse= " +rev);
			System.out.println("palindrome no.");
		}
		else 
		{
			System.out.println("non palindrome no.");
		}
	}
	
//5	
		void palindromestring()
		{
			String digits="naman";
			System.out.println("string= " +digits);
			
			char a[]=digits.toCharArray();
			int len=a.length;
			String rev="";
			
			for(int i=len-1;i>=0;i--)
			{
				//rev=rev+a[i];
				rev=rev+digits.charAt(i);
			}
			
			if(digits.equals(rev))
				System.out.println(rev +" is palindrome string");
			else 
				System.out.println(rev +" is not palindrome string");
			
		}
	
//6	
	void countdigits()
	{
		int num=123456789;
		System.out.println("no.= " +num);
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;			
		}
		System.out.println("no. of digits= " +count);
	}
	
//7
	//count no. of even & odd digits in a number
	void count_even_odd()
	{
		int num=123456789;
		System.out.println("no.= " +num);

		int evencount=0, oddcount=0;
		
		while(num!=0)
		{
			int rem=num%10;
			if(rem%2==0)
				evencount++;
			else 
				oddcount++;
			num=num/10;
		}
		System.out.println("no. of even digits= " +evencount);
		System.out.println("no. of odd digits= " +oddcount);
	}
	
	void find_even_odd()
	{
		int num=123456789;
		System.out.println("no.= " +num);
		
		String output=(num%2==0)?"even no.":"odd no.";
		System.out.println("this is " +output);
	}
	
	
//8	
	//sum of digits
	void sum()
	{
		int num=123456789;
		System.out.println("no.= " +num);
		
		int rem=0, sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("sum of digits= " +sum);
	}
	
//9
	void largest1()
	{
		int a=10,b=20,c=30;
		
		if(a>b&&a>c)
			System.out.println("a is greater");
		else if(b>a && b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");
	}

	void largest2()
	{
		int a=10,b=30,c=20;
		
		int largest=a>b?a:b;
		largest=c>largest?c:largest;
		
		System.out.println(largest);
	}
	
//10
	void fibonacci()
	{
		System.out.println("fibonacci series...");
		int a=0,b=1,c;
		System.out.print(a +" " +b +" ");
	
		for(int i=2;i<=10;i++)//we start i=2 coz we already printed 2 values
		{
			c=a+b;
			System.out.print(c +" ");
			a=b;
			b=c;
		}
	}
	
//11
	void primenum()
	{
		int num=78, count=0;
		System.out.println("no.= " +num);
	
		for(int i=1;i<=num; i++)
		{
			if(num%i==0)
				count++;
		}
		
		if(count==2)
			System.out.println("prime no.");
		else 
			System.out.println("not prime no.");	
	}
	
//12
	void random()
	{
		System.out.println("randomnum");
		//approach 1
		Random randm=new Random();
		int random_num=randm.nextInt(100);
		System.out.println(random_num);
		
		Double random_db=randm.nextDouble();
		System.out.println(random_db);
	
		
		//approach 2
		System.out.println(Math.random()); 	//double type	
		
		//approach 3
	/*	String randmNum=RandomStringUtils.randomNumeric(5);
		System.out.println("random no.= " +randmnum);
		String randmString=RandomStringUtils.randomAlphabetic(5);
		System.out.println("random string= " +randmString);*/
	}
	
	
	
//13
	void factorial1()
	{
		int num=5, fact=1;
	
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of " +num +" is " +fact);
	}
	
	void factorial2()
	{
		int num=5, fact=1;
		
		for(int i=num; i>=1; i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of " +num +" is " +fact);
	}
	
//14
	void sumarray1()
	{
		System.out.println("sum of array 1= ");
		int a[]= {5,6,7,8,9};
		
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum = sum+a[i];
		}
		System.out.println(sum);
	}
	
	void sumarray2()
	{
		System.out.println("sum of array 2= ");
		int a[]= {5,6,7,8,9};
		
		int sum=0;
		for(int value:a)
		{
			sum=sum+value;
		}	
		System.out.println(sum);
	}
	
	
//15
	void even_odd_in_array1()
	{
		System.out.println("find even and odd in array1");
		int a[]= {1,2,3,4,5};
			
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even no.= "+a[i]);
			}
			else if(a[i]%2!=0)
			{
				System.out.println("odd no.= "+a[i]);
			}
		}
	}
	
	void even_odd_in_array2()
	{
		System.out.println("find even and odd in array2");
		int a[]= {1,2,3,4,5};
		
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println("even no.= "+value);
			}
			else if(value%2!=0)
			{
				System.out.println("odd no.= "+value);
			}
		}
	}
	
	void even_in_array()
	{
		System.out.println("find even no. in array");
		int a[]= {1,2,3,4,5};
		
		System.out.println("even no. in array");
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
	
//16	
	//reverse words in String	
	static void reversestring()
	{	
//APPROACH 1		
		String str="Welcome to java";
		System.out.println("String = " +str);
		String[] words=str.split(" ");
		
		String reverseString="";
		
		for(String w:words)
		{
			String reversewords="";
			
			for(int i=w.length()-1; i>=0; i--)
			{
				reversewords=reversewords+w.charAt(i);
			}
			reverseString=reverseString+reversewords+" ";
		}
		
		System.out.println("string after reverse= " +reverseString);
		System.out.println('\n');
		
//APPROACH 2
		String string="Welcome to Selenium";
		System.out.println("String = " +string);
		String[] word=string.split("\\s");
		
		String reversestrings="";
		
		for(String wd:word)
		{
			StringBuilder sb=new StringBuilder(wd);
			sb.reverse();
			
			reversestrings=reversestrings+sb.toString()+" ";
		}
		System.out.println("string after reverse= " +reversestrings);		
	}
	
	
	static void sumofarray()
	{
//APPROACH 1		
		int a[]= {9,2,7,4,5};		
		int sum=0;
		for(int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("sum of array= " +sum);		
	
//APPROACH 2
		int b[]= {1,8,3,6};		
		int add=0;
		for(int c:b)
		{
			add=add+c;
		}
		System.out.println("sum of array= " +add);	
	}
	
//18	
	static void evenoddarray()
	{
		int a[]= {1,2,3,4,5,6};
		
		System.out.println("even elements in array");
		for(int value:a)
		{
			if(value%2==0)
				System.out.println(value);
		}
		System.out.println("odd elements in array");
		for(int value:a)
		{
			if(value%2!=0)
				System.out.println(value);
		}
	}

//19	
	//How To Check The Equality Of Two Arrays
	//APPROACH 1	
	static void equalarrays1()
	{	
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		
		boolean status=Arrays.equals(a, b);
	
		if(status==true)
		{
			System.out.println(status);
			System.out.println("arrays are equal");
		}
		else 
			System.out.println("arrays are not equal");
	}
	
	
	//APPROACH 2	
	static void equalarrays2()
	{
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		
		boolean status=true;
		//boolean status=Arrays.equals(a, b);
		
		if(a.length==b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				if(a[i]!=b[i])
					status=false;
			}
		}
		else 
		{
			status=false;
		}
		
		if(status==true)
			System.out.println("arrays are equal");
		else 
			System.out.println("arrays are not equal");
		
	}

//20	
	//Find Missing Number in an Array
	static void missingelement()
	{
		//array should not have duplicates
		//no need to be sorted order
		//values should be in range
		
		int a[]= {1,5,9,8,4,7,2,6};
		
		int sum1=0;
		for(int i=0; i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		
		int sum2=0;
		for(int i=1;i<=9;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("missing no. in array= " +(sum2-sum1));
	}

//22	
	//find max and min values in array	
	static void maxvalue()
	{
		int a[]= {6,9,5,7,4};
		
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{			
			if(a[i]>max)
			{
				max=a[i];
			}			
		}
		System.out.println("maximum value in array= " +max);
	}
	
	static void minvalue()
	{
		int a[]= {6,9,5,7,4};
		
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];				
			}
		}
		System.out.println("minimum value in array= " +min);
	}

//23	
//duplicate elements in array	
	static void duplicateInteger()	
	{
		int a[]= {1,2,3,4,5,3,1,6,7,5};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicate element= " +a[i]);
				}
			}
		}	
	}
	
	
	static void duplicateString()	
	{
		String str[]= {"java", "lrp", "man", "nice"};
		
		boolean status=false;
		for(int i=0; i<str.length; i++)
		{
			for(int j=i+1; j<str.length; j++)
			{
				if(str[i]==str[j])
				{
					System.out.println("duplicate element= " +str[i]);
					status=true;
				}
			}
		}
		if(status ==false)
		{
			System.out.println("duplicate element not found");
		}
	}
	

//duplicate elements in array using hashset	
	//it dont allow duplicate value, if there is any duplicate, it will return false
	static void duplicate()
	{
		String str[]= {"java", "lrp", "man", "nice", "java"};
		
		HashSet <String> lang=new HashSet<String>();
		boolean status=false;
		for(String l:str)
		{
			//System.out.println(lang.add(l));
			
			if(lang.add(l)==false)
			{
				System.out.println("duplicate element in hashset = "+l);
				status=true;
			}			
		}
		if(status ==false)
		{
			System.out.println("duplicate element not found");
		}
	}
	
//24
	//Searching an Element in Array _ Linear Search
	static void searchElement()
	{
		int a[]= {1,2,3,4,5};
		int search_ele=4;
		boolean status=false;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==search_ele)
			{
				System.out.println("element found at index= " +i);
				status=true;
				break;
			}
		}
		if(status ==false)
		{
			System.out.println("element not found");
		}
		
	}

//25	
	//REMOVE JUNK AND SPECIAL CHARACTER FROM STRING
	static void removejunk()
	{
		String st="!@#$%SELENIUM^&*123456";		
		st=st.replaceAll("[^a-zA-Z0-9]", "*");		
		System.out.println(st);
		
        String st1="!@#$%SELENIUM^&*123456";		
		st1=st1.replaceAll("[^a-zA-Z0-9]", "");		
		System.out.println(st1);
	}

//26	
	//REMOVE WHITE SPACES
	static void removeSPACES()
	{
		String st="REMOVE         WHITE     SPACES";
		st=st.replaceAll("\\s","");		
		System.out.println(st);		
	}

//27
	
	//How To Count occurances of a Character in a string
	public static void countoccurances()
	{
		String st="bhool bhulaiya";
		int totalcount=st.length();
		int count_afterremove_o=st.replace("o","").length();
		
		int count=totalcount-count_afterremove_o;
		
		System.out.println("no. of occurances= " +count);
		
	}

//28	
	//How To Count Words in a String
	static void countwords()
	{
		String st="bhool bhulaiya part 2";
		int count=1;
		
		for(int i=0; i<st.length()-1;i++)	//here we use length()-1 coz count started from 1
		{
			if(st.charAt(i)==' ' && st.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println("no. of words = " +count);
		
	}
	
	
//29
	//find vowel and consonant in string
	static void vowelandcons()
	{
		String a="welcome to java";
		char ch[]=a.toCharArray();
		
		int stringlength=ch.length;
		int vowelcount=0;
		int conscount=0;
		int other=0;
		
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				vowelcount++;
			}
			else if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z')) 
			{
				conscount++;
			}
			else 
			{
				other++;
			}
				
		}
		System.out.println("length of string=  " +stringlength);
		System.out.println("vowel count is     " + vowelcount);
		System.out.println("consonant count is " +conscount);
		System.out.println("other count is     " +other);
	}
	
	
//30	
	public static void armstrongNumber()
	{
		int num=153, digits=0;
		System.out.println("number= " +num);
		
		int temp1=num;
//count digits		
		while(temp1!=0)
		{
			temp1= temp1/10;
			digits++;
		}
		System.out.println("no. of digits= " +digits);
	
		int rem , add=0;
		
		int temp2=num;
		while (temp2!=0) 
		{						
			rem=temp2%10;
			
			int mul=1;
			for(int i=1; i<=digits; i++)
			{
				mul= mul*rem;
			}
			
			add=add+mul;
			temp2=temp2/10;
			
		}
		System.out.println(add);		
		if(add==num)
		{
			System.out.println(num +" is armstrong no.");
		}
		else 
		{
			System.out.println(num +" is not armstrong no.");
		}	
	}
	
	
//31
	//table of 5
	static void table5()
	{
		int count=1;
		for(int i=1; i<=50; i++)
		{
			if(i%5==0)
			{
				System.out.println(5 +" * " +count++ +" = " +i);
			}
		}
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		PRACTICE pr=new PRACTICE();
		pr.swap1();				System.out.println('\n');
		pr.swap2();				System.out.println('\n');
		pr.swap3();				System.out.println('\n');
		pr.swap4();				System.out.println('\n');
		pr.swap5();				System.out.println('\n');
		pr.reverse1();			System.out.println('\n');
		pr.reverse2();			System.out.println('\n');
		pr.reverse3();			System.out.println('\n');
		pr.reverseString1();	System.out.println('\n');
		pr.reverseString2();	System.out.println('\n');
		pr.reverseString3();	System.out.println('\n');
		pr.palindrome();		System.out.println('\n');
		pr.palindromestring();	System.out.println('\n');
		pr.countdigits();		System.out.println('\n');
		pr.count_even_odd();	System.out.println('\n');
		pr.find_even_odd();		System.out.println('\n');
		pr.sum();				System.out.println('\n');	
		pr.largest1();			System.out.println('\n');	
		pr.largest2();			System.out.println('\n');	
		pr.fibonacci();			System.out.println('\n');	
		pr.primenum();			System.out.println('\n');	
		pr.random();			System.out.println('\n');
		pr.factorial1();		System.out.println('\n');
		pr.factorial2();		System.out.println('\n');
		pr.sumarray1();			System.out.println('\n');
		pr.sumarray2();			System.out.println('\n');
		pr.even_odd_in_array1(); System.out.println('\n');
		pr.even_odd_in_array2(); System.out.println('\n');
		pr.even_in_array(); 	 System.out.println('\n');
		reversestring();			System.out.println('\n');
		sumofarray(); 				System.out.println('\n');
		evenoddarray(); 			System.out.println('\n');
		equalarrays1();				System.out.println('\n');
		equalarrays2();				System.out.println('\n');
		missingelement();			System.out.println('\n');
		maxvalue();			System.out.println('\n');
		minvalue();			System.out.println('\n');
		duplicateInteger();		System.out.println('\n');
		duplicateString();		System.out.println('\n');
		duplicate();		System.out.println('\n');
		searchElement();		System.out.println('\n');
		removejunk();		System.out.println('\n');
		removeSPACES();		System.out.println('\n');
		countoccurances();		System.out.println('\n');
		countwords();		System.out.println('\n');
		vowelandcons();		System.out.println('\n');
		armstrongNumber();		System.out.println('\n');
		table5();			System.out.println('\n');
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
