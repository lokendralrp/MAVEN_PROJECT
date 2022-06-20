package lokendrap;
import java.util.*;
public class AUTOMOBILE 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER NO. OF WHEELS: 2/4/16");
		int wheels= sc.nextInt();
		
		
		switch(wheels)
		{
		case 4:	System.out.println("CLASS BMW");
				new BMW();		System.out.println('\n'); break;
		
		case 2: System.out.println("CLASS BIKE");
				new BIKE();		System.out.println('\n'); break;
				
		case 16: System.out.println("CLASS TRUCK");
				 new TRUCK();	break;
				 
		default: System.out.println("no data");	
		sc.close();
		}	
	}
}

















/*		System.out.println("CLASS BMW");
new BMW();		System.out.println('\n');

System.out.println("CLASS BIKE");
new BIKE();		System.out.println('\n');

System.out.println("CLASS TRUCK");
new TRUCK();
*/	
