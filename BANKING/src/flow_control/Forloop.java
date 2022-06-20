package flow_control;

public class Forloop 
{
	int t1 =5, t2=15 ,i ,j;
	
	public void table5()			//NESTED FOR
	{
		for( i=1; i<=2; i++)
		{	
			for(j=1; j<=2; j++)	
			{
				System.out.print((t1 +" * "+i+" = "+ (t1*i) +"  "));
				System.out.println(t2 +" * "+j+" = "+ (t2*j));
			}
		}
	}
	
	public void table15()
	{
		for(int a=10; a>=5; a--)		//backward table
		{
			System.out.println(t2 +" * "+a+" = "+ (t2*a));
		}
	}
	void oddno()
	{
		System.out.println("odd no. between 0-10");
		for(int i=0; i<=10; i++)
		{
			if(i%2==0)
			continue;
			System.out.print(i +"  ");
		}
	}
	
	
	public static void main(String[] args)
	{
		Forloop demo= new Forloop();
		
		demo.table5();
		System.out.println('\n');
        
		demo.table15();
		System.out.println('\n');
		
		demo.oddno();
		
		
	}

}
