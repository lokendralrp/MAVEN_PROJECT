package strings_and_arrays;

public class Multi_Dim_Array 
{
	public static void main(String[] args) 
	{
		int a[][]=new int[3][2];		//3 rows, 2 column		//    0|1
		a[0][0]=10;			a[0][1]=20;							//0| 10|20		
		a[1][0]=30;			a[1][1]=40;							//1| 30|40
		a[2][0]=50;			a[2][1]=60;							//2| 50|60
		
					//R1       R2       R3
		int b[][] = {{11,22,77}, {33,44,88}, {55,66,99}};
		
		System.out.println("NO. OF ROWS- " +a.length);
		System.out.println("NO. OF COLOUMN- " +a[0].length);	//a[0]-represent row
		System.out.println("NO. OF COLOUMN- " +a[1].length);
		
		System.out.println('\n');
//classic for loop
		
		for(int i=0; i<=a.length-1;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println('\n');

//advanced for loop		
		for(int r[]:b)
		{
			for(int i:r)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
	}

}
