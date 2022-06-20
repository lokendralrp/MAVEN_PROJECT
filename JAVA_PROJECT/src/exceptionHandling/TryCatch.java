package exceptionHandling;

public class TryCatch 
{
	public void handleException()
	{
		int a=100;
		try			//we cant use try block alone, used with either catch or finally or both
		{
			
			System.out.println("a= " +a);
			
			int data=100/0;
			System.out.println(data);
			System.out.println("this is try block");
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			System.out.println("this is finally block");
		}
		System.out.println("exception handled");
	}
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		TryCatch tc=new TryCatch();
		tc.handleException();
		
	}

}
