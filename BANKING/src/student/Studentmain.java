package student;

public class Studentmain 
{

	public static void main(String[] args) 
	{	
		System.out.println("ASSIGN VALUES BY USING REFERENCE VARIABLE");   //ASSIGN VALUES BY USING REFERENCE VARIABLES
		Student st5 = new Student();
		st5.age=21;
		st5.mothername="pratiksha";
		st5.bloodgroup='A';
		st5.display2();
		
		Student st6 = new Student();
		st6.age=22;
		st6.mothername="divyanshi";
		st6.bloodgroup='b';
		st6.display2();
		
		
		System.out.println("ASSIGN VALUES BY USING METHOD");		//ASSIGN VALUES BY USING METHODS
		Student st3=new Student();
		st3.getvalues(0133,"mahendra", 'C');
		st3.display1();
		
		Student st4=new Student();
		st4.getvalues(0147,"surendra", 'D');
		st4.display1();
		
		
		System.out.println("ASSIGN VALUES BY USING CONSTRUCTOR");		//ASSIGN VALUES BY USING CONSTRUCTOR
		Student st1= new Student (101, "aman", 'A');		
		st1.display();
		
		Student st2= new Student (102, "LRP", 'B');		
		st2.display();
	}
		
}
