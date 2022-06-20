package student;

class NAME
{
	String firstname, middlename, lastname;
	
	public NAME(String fname, String mname, String lname)
	{
		firstname=fname;
		middlename=mname;
		lastname=lname;
	}
}

class STUDENTS
{
	int age;
	NAME n;
	public void display(int age, NAME n)
	{
		System.out.println("FULLNAME: " +n.firstname +n.middlename +n.lastname);
		System.out.println("AGE= " +age);
	}
}

public class HAS_A_RELATION1 
{
	public static void main(String[] args) 
	{
		
		NAME n=new NAME("SACHIN ", "RAMESH ", "TENDULKAR ");
		new STUDENTS().display(21, n);
	}
}
