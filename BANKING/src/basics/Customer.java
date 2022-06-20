package basics;

public class Customer {
	
	
	int id = 10;
	
	public void printId()
	{
		System.out.println("Id= "+id);
	}
	public static void main(String args[])
	
	{
		Customer customer1 = new Customer();
			
			System.out.println("value of Id is "+customer1.id);
		
	    customer1.printId();
	}
	
	
}
