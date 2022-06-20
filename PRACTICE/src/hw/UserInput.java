package hw;
import java.util.Scanner;

public class UserInput 
{
	public static void main(String[] args) 
	{
		int roll, marks;
		long mob_no;
		String fname, lname, email, city;
		char bg, gr;
		
		Scanner sc= new Scanner(System.in);
			
		System.out.println("enter your roll");	roll = sc.nextInt();
		
		System.out.println("enter Fname");		fname= sc.next();
		
		System.out.println("enter Lname");		lname= sc.next();
		
		System.out.println("enter email");		email= sc.next();
		
		System.out.println("enter mobile number");		mob_no=sc.nextLong();
		
		System.out.println("enter city");		city= sc.next();
		
		System.out.println("enter your marks");		marks = sc.nextInt();
		
		System.out.println("enter your grade");		gr=sc.next().charAt(0);
		
		System.out.println("enter your blood group");		bg=sc.next().charAt(0);
		
		
		
		System.out.println("Your details are as below:");
		System.out.println('\n');
		
		System.out.println("Roll: " +roll);
		System.out.println("Fname: " +fname);
		System.out.println("Lname: " +lname);
		System.out.println("Email id: " +email);
		System.out.println("Mobile no.: " +mob_no);
		System.out.println("City: " +city);
		System.out.println("Marks: " +marks);
		System.out.println("Grade: " +gr);
		System.out.println("Blood group" +bg);
		
		
		//below lines are just practise
		System.out.println('\n');
		System.out.print("#1.Roll: " +roll +" #2.Fname: " +fname +" #3.Lname: " +lname );
		System.out.print(" #4.Email id: " +email +" #Mobile no.: " +mob_no +" #6.City: " +city);
		System.out.println(" #7.Marks: " +marks +" #8.Grade: " +gr +" #9.Blood group" +bg);
		sc.close();	
		
		
		
		
	}
}
