package lokendrap;

public class Interview 
{
	public static void main(String[] args) 
	{
		String st="java, selenium, maven, git";
		
		String str[]=st.split(",");
		
		for(String s:str)
		{
			System.out.println(s);
		}
		
		System.out.println('\n');
		
		
		String s1="java";
		String s2="javascript";
		String s3="javamethods";
		
		String s4=s1+s2+s3;
		System.out.println(s4);
		System.out.println(s1+s2+s3);
//----------------------------------------------	
		System.out.println('\n');
		
		int a=10, b=20;
		
		String output=a>b?"a is largest":"b is largest";
		System.out.println(output);
		//OR
		int largest=a>b?a:b;
		System.out.println("largest no. is " +largest);
//------------------------------------------------------		
		//FIND LOWER CASE AND UPPER CASE CHARACTER
		System.out.println('\n');
		
		String sent="WelComE tO JavA";
		int lower=0;
		int upper=0;
		
		for(int i=0; i<sent.length(); i++)
		{
			char ch=sent.charAt(i);
			
			if((ch>='A')&&(ch<='Z'))
			{
				upper++;
			}
			else if((ch>='a')&&(ch<='z'))
			{
				lower++;
			}
		}
		
		System.out.println("upper= " +upper);
		System.out.println("lower= " +lower);
		
//---------------------------------------------		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
