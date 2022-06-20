package flow_control;

public class Pattern {
	
	
	public void pyramid1()
	{
		System.out.println("PYRAMID 1");
		for (int i=1; i<=4; i++)
		{			//i=row
			for(int j=1; j<=i; j++)		//j=column
			{	
				System.out.print(j);		//without inverted comma, we can show values
			}
			System.out.println();
		}
	}
	
	public void pyramid2()
	{
		System.out.println("PYRAMID 2");
		for (int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void pyramid3()
	{
		System.out.println("PYRAMID 3");
		for (int r=1; r<=4; r++)
		{
			for(int c=4; c>=r; c--)
			{
				//System.out.print("*");
				System.out.print(c);				//4321 432 43 4
				//System.out.print(r);				//1111 222 33 4
			}
			System.out.println();
		}
	}
	
	public void pyramid4()
	{
		System.out.println("PYRAMID 4");
		int count=0;  //int count=1;
		for (int r=1; r<=4; r++)
		{
			for(int c=1; c<=r; c++)
			{   
				System.out.print(++count +" ");			//count++
			}
			System.out.println();
		}
	}
	
	public void pyramid5()
	{
		System.out.println("PYRAMID 5");
		for (int r=1; r<=5; r++)
		{
			for(int c=r; c>=1; c--)
			{
				//System.out.print("*");
				System.out.print(c+" ");
				//System.out.print(r);
			}
			System.out.println();
		}
	}
	
	
	public void pyramid6()
	{
		System.out.println("PYRAMID 6");
		for (int r=1; r<=5; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(c+" ");
			}
			for(int c=r-1; c>=1; c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
	
	public void pyramid7()
	{
		System.out.println("PYRAMID 7");
		for (int i=1; i<=4; i++)
		{
			int num=i;
			for(int j=1; j<=i; j++)
			{
				System.out.print(num+" * ");
				num= num+4-j;				//here we use num+4 coz rows i=4.
			}
			System.out.println();
		}
	}
	
	public void pyramid8()
	{
		System.out.println("PYRAMID 8");
		int count=0;
		for (int r=1; r<=5; r++)
		{
			for(int c=1; c<=3; c++)
			{
				count=count+1;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
	
	public void pyramid9()
	{
		System.out.println("PYRAMID 9");
		int count=0;
		for (int r=1; r<=5; r++)		
		{
			if(r%2!=0)					// show only odd rows, if else block will empty		
			{
				for(int c=1; c<=3; c++)	//show simple program in 3 column without if-else
				{
					count=count+1;
				System.out.print(count+" ");
				}
			}
			else
			{	
				int temp=count+1;
				for(int c= count+3; c>=temp; c--)
				{
					count= count+1;
					//System.out.print(count+" ");
					System.out.print(c+" ");
				}
			}
			System.out.println();
		}
	}
	
	
	public void pyramid10()
	{
		System.out.println("PYRAMID 10");
		int count=0;
		for(int i=1; i<=4; i++)
		{
			for(int j=4; j>=i; j--)			//j=2*(5-i) //j=4
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				count=count+1;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
	
	public void pyramid15()
	{
		System.out.println("PYRAMID 15");
		for(int i=1; i<=5; i++)
		{								//j=1 for pyramid
			for(int j=5; j>=i; j--)		//if j=i, then forward slash will print
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
	
	
	public void pyramid18()
	{
		System.out.println("PYRAMID 18");
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)		
			{
				if(i>=2 && j<=i-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
	
	
	
	public void pyramid16()
	{
		System.out.println("PYRAMID 16");
		
		for(int i=1; i<=4; i++)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=2; l<=i; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void pyramid17()
	{
		System.out.println("PYRAMID 17");
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=4; k>=i; k--)
			{
				System.out.print("*");
			}
			for(int l=3; l>=i; l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void pyramid11()
	{
		System.out.println("PYRAMID 11");
		for(int i=1; i<=4; i++)
		{
			for(int j=3; j>=i; j--)			
			{
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
	
	
	public void pyramid14()
	{
		System.out.println("PYRAMID 14");
		for(int i=1; i<=4; i++)
		{
			for(int j=2; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=4; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void pyramid12()
	{
		System.out.println("PYRAMID 12");
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++)
		{
			for(int j=3; j>=i; j--)		//if j=4, then 2 line of 4 stars will print.
			{
				System.out.print("*");
			}
		   System.out.println();
		}
	}
	

	public void pyramid13()
	{
		System.out.println("PYRAMID 13");
		for(int i=1; i<=4; i++)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=3; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	
	
	public void pattern19a()
	{
		System.out.println("PATTERN 19A");
		for(int i=1; i<=4; i++)
		{
			for(int j=i; j<=4; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void pattern19b()//HW1
	{
		System.out.println("PATTERN 19B");
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	public void pattern20()//HW2
	{
		System.out.println("PATTERN 20");
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(j);
			}
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	
	public void pattern20a()
	{
		System.out.println("PATTERN 20a");
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(j);
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	public void pattern21()
	{
		System.out.println("PATTERN 21");
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--)
			{
				System.out.print(k);
			}
			for(int l=2; l<=i; l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}	
	
	
	public void pattern21a()
	{		
	System.out.println("PATTERN 21");
		for(int i=1; i<=5; i++)
		{	int k=i;
		
		for(int j=1; j<=2*i-1; j++)
			{
				System.out.print(k);
				  if(j<(2*i-1)/2+1)
					  k--;
				  else if(j>=((2*i-1)/2)+1)
					  k++;
			}	
			System.out.println();
		}
	}		
	
	public static void main(String[] args) {
		
		Pattern demo=new Pattern();
		demo.pyramid1();	System.out.println('\n');
		demo.pyramid2();	System.out.println('\n');
		demo.pyramid3();	System.out.println('\n');
		demo.pyramid4();	System.out.println('\n');
		demo.pyramid5();	System.out.println('\n');
		demo.pyramid6();	System.out.println('\n');
		demo.pyramid7();	System.out.println('\n');
		demo.pyramid8();	System.out.println('\n');
		demo.pyramid9();	System.out.println('\n');
		demo.pyramid10();	System.out.println('\n');
		demo.pyramid15();	System.out.println('\n');
		demo.pyramid18();	System.out.println('\n');
		demo.pyramid16();	System.out.println('\n');
		demo.pyramid17();	System.out.println('\n');
		demo.pyramid11();	System.out.println('\n');
		demo.pyramid14();	System.out.println('\n');
		demo.pyramid12();	System.out.println('\n');
		demo.pyramid13();	System.out.println('\n');
		demo.pattern19a();	System.out.println('\n');
		demo.pattern19b();	System.out.println('\n');
		demo.pattern20();	System.out.println('\n');
		demo.pattern20a();	System.out.println('\n');
		demo.pattern21();	System.out.println('\n');
		demo.pattern21a();	System.out.println('\n');
		
		
	}
}
