package basics;

public class Subtraction 	{

	
	
int a=10, b=20, subtract;

  /*  System.out.print("a-b= ");
	System.out.println(a-b);*/
	
	
public void subtract()		{
	subtract=b-a;
}


public void showResult() 	{
	System.out.println("Result of b and a is "+subtract);
	
}
public static void main(String args[]) 		{
	Subtraction difference= new Subtraction();
	
	
	difference.subtract();
	
	difference.showResult();
	
	
}
}
