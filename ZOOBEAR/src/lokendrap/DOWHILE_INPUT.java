package lokendrap;
import java.util.Scanner;

public class DOWHILE_INPUT 
{
	public static void main(String[] args) 
	{
		
	
		int input;
		Scanner sc= new Scanner(System.in);
		
		do
		{
			System.out.println("1: ADDITION,   2: SUBSTRACTION   3: MULTIPLICATION   4: DIVISION");
			input=sc.nextInt();
			
			int k=10,l=20;
			
			switch(input)
			{
			case 1: int i= 100, j=200;
						System.out.println(i+j); break;
			case 2:System.out.println(l-k);break;
			case 3:System.out.println(l*k);break;
			case 4:System.out.println(l/k);break;
			}
			System.out.println("if u want to continue, press 1");
			System.out.println("otherwise press 0");
			input=sc.nextInt();
			
		}while(input!=0);
		
		sc.close();
	}
}
