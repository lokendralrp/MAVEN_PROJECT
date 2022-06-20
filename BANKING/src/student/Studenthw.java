package student;

public class Studenthw 
{
	int sid, sub1, sub2, sub3, stotal; String sname;
	
	void getstudata(int id, String name, int num1, int num2, int num3,  int total)
	{
		sid=id;
		sub1=num1;
		sub2=num2;
		sub3=num3;
		sname=name;
		stotal=total;	
	}
	
	void display()
	{
		
		System.out.println(sid+"  " +sname +"     " +sub1 +"        " +sub2 +"        " +sub3 +"        " +stotal);
	}
	
	void display1()
	{
	System.out.println("ID   " +" NAME      " +"MATHS  " +"PHYSICS  " +"CHEMISTERY  " +"TOTAL MARKS");
	}
	
	public static void main(String[] args) 
	{
		Studenthw st=new Studenthw();
		st.display1();
		Studenthw st1=new Studenthw();
		Studenthw st2=new Studenthw();
		Studenthw st3=new Studenthw();
		
		st1.getstudata(101,"Ayush", 90, 80, 70, 240 );
		st1.display();
		st2.getstudata(102,"Azhar", 70, 70, 70, 210 );
		st2.display();
		st3.getstudata(103,"Bhusan", 90, 90, 90, 270 );
		st3.display();
		
	}
	
	
}








/*void getStuData(int id, String name)
{
	sid=id;
	sname=name;
}


void display()
{
	System.out.println("ROLL NO." +sid +"  " +sname);
}

public static void main(String[] args) 
{
	Studenthw a=new Studenthw();
	a.getStuData(01, "Aman Tamrakar");
	a.display();
	a.getStuData(02, "Lokendra Patel");
	a.display();
	a.getStuData(03, "Mohit Dwivedi");
	a.display();
}*/
