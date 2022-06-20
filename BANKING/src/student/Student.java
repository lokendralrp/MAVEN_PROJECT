package student;

public class Student 
{
	int sid, rollnum, age;
	String sname, fathername, mothername;
	char grade, section, bloodgroup;
	
	Student()
	{
		
	}
	
//ASSIGN VALUES BY USING REFERENCE VARIABLE	
	
	void display2()
	{
		System.out.println(age +" " +mothername +" " +bloodgroup);
		
	}
	
	
//ASSIGN VALUES BY USING METHOD
	
	void getvalues (int rollnum, String fathername, char section)
	{
		this.rollnum=rollnum;
		this.fathername=fathername;
		this.section=section;
	}
	
	
	void display1()//class student main
	{
		System.out.println(rollnum +" " +fathername +" " +section);
	}
	
		
	//ASSIGN VALUES BY USING CONSTRUCTOR

 	Student  (int id, String name, char g)	
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	void display()//class student main
	{
		System.out.println(sid +" " +sname +" " +grade);
		
	}
}
