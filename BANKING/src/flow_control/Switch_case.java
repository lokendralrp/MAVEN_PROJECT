package flow_control;

public class Switch_case 
{
	int date = 8; int month =4;
	
	public void weekdays()
	{	
		switch(date)
		{
		case 1  :System.out.println("MONDAY");break;
		case 2  :System.out.println("TUESDAY");break;
		case 3  :System.out.println("WEDNESDAY");break;
		case 4  :System.out.println("THURSDAY");break;
		case 5  :System.out.println("FRIDAY");break;
		case 6  :System.out.println("SATURDAY");break;
		case 7  :System.out.println("SUNDAY");break;
		default :System.out.println("INVALID");
		//without default nothing show after wrong input
		}
	}	
	
	public void months()
	{
		switch(month)
		{	
		case 1: System.out.println("JAN"); 
		case 2: System.out.println("FEB"); 
		case 3: System.out.println("MARCH"); 
		System.out.println("QUARTER 4");	break;
		case 4: System.out.println("APR"); //break;
		case 5: System.out.println("MAY"); //break;
		case 6: System.out.println("JUNE"); //break;
		System.out.println("QUARTER 1");break;
		case 7: System.out.println("JULY"); //break;
		case 8: System.out.println("AUG"); //break;
		case 9: System.out.println("SEPT"); //break;
		System.out.println("QUARTER 2");break;
		case 10: System.out.println("OCT"); //break;
		case 11: System.out.println("NOV"); //break;
		case 12: System.out.println("DEC"); //break;
		System.out.println("QUARTER 3");break;
		default: System.out.println("ENTER 1-12");
		}
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Switch_case demo=new Switch_case();
		demo.weekdays();
		demo.months();
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	}
}


