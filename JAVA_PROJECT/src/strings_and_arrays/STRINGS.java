package strings_and_arrays;

public class STRINGS 
{
	public static void main(String[] args)
	{
	
	String s= "Welcome ", s1=" to java ", s2=" selenium " ;
	String s3=" welcome ", s4=" wel come ", s5="WELCOME";
//concat
	System.out.println(s.concat(s1));
	System.out.println(s.concat(" here"));													System.out.println('\n');
	
//length (length including spaces)
	System.out.println("length- " +s.length());												System.out.println('\n');
	
//trim-	(remove left and right side spaces)
	
	System.out.println("before trim- "+s3 +s4);
    System.out.println("after trim- :" +s3.trim() +s4.trim());								System.out.println('\n');
	
//charAt(); 	index no. starts from 0.	
	System.out.println(s.charAt(3));
	System.out.println(s3.charAt(3));														System.out.println('\n');
	
//contains();  sequence of char(true or false)	(case sensitive)
	System.out.println("lew= " +s.contains("lew"));
	System.out.println("wel= " +s.contains("wel"));
	System.out.println("WEL= " +s.contains("WEL"));
	System.out.println("Wel= " +s.contains("Wel"));
	System.out.println("xyz= " +s.contains("xyz"));												System.out.println('\n');
	
//equals(); (checks case and spaces)
	System.out.println(s +" = " +s.equals(s3));
	System.out.println(s +" = " +s.equals("Welcome"));		//"Welcome" without space
	System.out.println(s +" = " +s.equals("Welcome "));											System.out.println('\n');
	
	
//equalsIgnoreCase();
	System.out.println(s5 +" = " +s5.equalsIgnoreCase("welcome"));								System.out.println('\n');
	
	
//replace();
	System.out.print("replace e with a-  ");		//replace char
	System.out.println(s.replace('e', 'a'));
	
	String s6="welcome to java";
	System.out.print("s6=welcome to java & after replace=  ");
	System.out.println(s6.replace("java", "selenium"));											System.out.println('\n');	
	
	
//tolowercase();
	System.out.println(s5 +" using toLowerCase() = " +s5.toLowerCase());
	System.out.println(s3 +" using toUpperCase() = " +s3.toUpperCase());						System.out.println('\n');
	
	
//	SUBSTRING
	/*		0 1 2 3 4 5 6 	----STARTING INDEX	
			W E L C O M E
			1 2 3 4 5 6 7   ----ENDING INDEX
	*/
	System.out.println("use of substring method:");
	System.out.println(s.substring(3,7));		//here 3 is starting and 7 is ending index
	System.out.println(s.substring(0,3));		//here 0 is starting and 3 is ending index
	
	
	}
}
