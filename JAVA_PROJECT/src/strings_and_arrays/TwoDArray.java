package strings_and_arrays;

import java.util.Scanner;

public class TwoDArray 
{
	int a[][], row, col;
	Scanner sc;
	int sum;
	
	public void twodarray()
	{
		sum=0;
		sc=new Scanner(System.in);
		System.out.println("enter the no of row");
		row=sc.nextInt();
		
		System.out.println("enter the no of column");
		col=sc.nextInt();
		a=new int[row][col];
		System.out.println(" enter the elements for " +row +" by " +col +" matrix: ");
		for(int r=0; r<row; r++)
		{
			for(int c=0; c<col; c++)
			{
				a[r][c]=sc.nextInt();
			}
		}
	}

	
	
	public void displaymatrix()
	{
		for(int r=0; r<row; r++)
		{
			for(int c=0;c<col; c++)
			{
				System.out.print(a[r][c] +" ");
			}	
			System.out.println();		
		}
	}
	
	
	public void borderaddition()
	{
		for(int r=0; r<row; r++)
		{
			for(int c=0; c<col; c++)
			{
				if(r==0||r==row-1||c==0||c==col-1)
				{
					sum=sum+a[r][c];
				}
			}
		}
		System.out.println("sum of outer values is " +sum);
	}
	
	
	public void incompletemethod()
	{
		int a[]=new int[5];
		for(int i=0; i<3; i++)
		{
			a[i]=10*i;
		}
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}
	}
	
	
	
	
	public static void main(String[] args) 
	{
		TwoDArray td=new TwoDArray();
		td.twodarray();
		td.displaymatrix();
		td.borderaddition();
		td.incompletemethod();
	}
	
	
	
	
}
