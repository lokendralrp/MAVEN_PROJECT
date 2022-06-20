package eNCAPSULATION;

public class Demo 
{
	public static void main(String[] args) 
	{
		Readonly ro=new Readonly();
		System.out.println(ro.getBankname());
		
		Writeonly wo=new Writeonly();
		wo.setBranchname("Sadar");
	}
}
