package hw;

public class Employee 
{
	int empid; 
	String empname, add;

	void get(int empid, String empname, String add)
	{
		this.empid=empid;
		this.empname=empname;
		this.add=add;
	}
	
	void set()
	{
		System.out.println(empid +" " +empname +" " +add);
	}
	
	
	public static void main(String[] args) 
	{
		Employee ob1= new Employee();
		ob1.get(101, "MAHESH", "15/504 AZAD NAGAR");
		ob1.set();
	}
}
