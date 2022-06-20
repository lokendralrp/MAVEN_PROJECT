package flow_control;

public class BreakContinue 
{
	
	public void odd_for()
	{
		System.out.println("odd no from for-continue");
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
				continue;	
			System.out.print(i+" ");
		}
	}
	
	public void even_for()
	{
		System.out.println("even no. from for-continue");
	    for(int i=1; i<=10; i++)
	    {
	    	if(i%2==1)
	    		continue;
	    	System.out.print(i+" ");
	    }
	}
	
	
	public void odd_while()
	{
		System.out.println("odd no. from while-continue");
		int i=10;
		while(i<=20)
		{
			if(i%2==0)
			{
				i++;
				continue;
			}
		System.out.print(i+" ");
		i++;
		}
	}
	
	
	public void even_while()
	{
		System.out.println("even no. from while-continue");
		int i=10;
		while(i<=20)
		{
			if(i%2==1)
			{
				i++;
				continue;
			}
		System.out.print(i+" ");
		i++;
		}
	}
	
	
	
	public void dowhilecontinue()
	{
		System.out.println("table-5");
		int i=1;
		do
		{
			if(i%5!=0)
			{
				i++;
				continue;
			}
			System.out.print(i+" ");
			i++;
		}while(i<=50);
	}
	
	
	public void nestedforcontinue()
	{
		System.out.println();
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				//if(i==2 && j==2)
					if(i==j)
				{
					continue;
				}System.out.print(i +"--"  +j +" "); 
			}
		}System.out.println("loop complete");
	}
	
	
	public void breakwhile()
	{
		int i=0;
		while (i<=5)
		{
			//i++;
			System.out.print(i+("  " ));
			i++;
			if(i==4)
			{
				break;
			}
		}System.out.println("loop complete");
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		BreakContinue demo = new BreakContinue ();
		demo.odd_for(); 
		System.out.println('\n');
		
		demo.even_for();
		System.out.println('\n');
	    
		demo.odd_while();
		System.out.println('\n');
		
		demo.even_while();
		System.out.println('\n');
		
		demo.dowhilecontinue();
		System.out.println('\n');
		
		demo.nestedforcontinue();
		System.out.println('\n');
		
		demo.breakwhile();
		System.out.println('\n');
		
	}

}
