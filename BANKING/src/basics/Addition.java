package basics;

public class Addition {

	int a=10, b=20, sum;
	
	int x; int y;
	
	//we can also write 'calculate_addition'
	public void calculateAddition()
	
	{
		sum=a+b;
	}
	public void displayAddition()
	{
		System.out.println("addition of a and b is "+sum);
		
	}
	
	int sum(int x, int y)
	{
		this.x=x;
		this.y=y;
		return(x+y);
	}
	
	public void display()
	{
		System.out.println(sum(5,7));	
	}
	
	public static void main(String args[])
	{
		Addition add= new Addition();
		add.display();
		
		Addition add1= new Addition();
		System.out.println(add1.sum(3,4));

	
		//add.displayAddition();
		add.calculateAddition();
		add.displayAddition();
		
	}
	}
	

