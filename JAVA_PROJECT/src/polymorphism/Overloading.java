package polymorphism;

public class Overloading 
{
	void show()
	{
		System.out.println("this is method 1 (blank)");
	}

	
	void show(int a)		//CASE 1: promotion from char to int
	{
		System.out.println("this is method 2 & value of 'a' is  "+a);
	}

	void show(int a, String b)
	{
		System.out.println("this is method 3");
		System.out.println("this is " +b +"  and my age is " +a);
	}
	
	
	void show(String a, long b)
	{
		System.out.println("this is method 4");
		System.out.println(a +" earns rs. " +b +" lacs monthly");
	}

	void show(char a, int b)
	{
		System.out.println("this is method 5");
		System.out.println("a+b= " +(a+b));
	}

/*	void show(int a, int b)      //this method is not working coz of above method
	{
		System.out.println("this is method 6");
		System.out.println("a+b= " +(a+b));
	}
*/	
	public static void main(int a, int b)
	{
		System.out.println("this is static & main method no. " +a +" and " +b +"nd is at the bottom");
	}
	

	public static void main(String[] args) 
	{
		Overloading ol=new Overloading();
		ol.show();			System.out.println('\n');		//1
		ol.show('a');		System.out.println('\n');		//2
		ol.show(12);			System.out.println('\n');		//2
		ol.show(27, "Lokendra patel");		System.out.println('\n');		//3
		ol.show("Rahul", 28);		System.out.println('\n');			//4
		ol.show('a', 20);		System.out.println('\n');				//5
		//ol.show(20, 30);			System.out.println('\n');		//6
		
		main(1,2);			System.out.println('\n');		//static method dont need obj
		ol.main(2);			System.out.println('\n');
		
			
	}
	
	public void main(int b)
	{
		System.out.println("this is main method no. " +b +"outside the actual main class");
		
	}
	
	
}
