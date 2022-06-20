package strings_and_arrays;

public class Single_Dim_Array 
{
	public void object_array()
	{
		Object ob[]=new Object[3];			
		
		ob[0]="lokendra"; ob[1]=25; ob[2]=7999123123l;
		
		System.out.println("length of ob is - " +ob.length);				System.out.println('\n');
		
		for(int i=ob.length-1; i>=0; i--)		//backward loop
		{
			System.out.println(ob[i]);
		}
																			System.out.println('\n');
		for(Object i:ob)
		{
			System.out.println(i);
		}
	}
	
	
	
	public void int_array()
	{
		//IF WE KNOW THE SIZE
				int a[]=new int[5];		//declared array (array of size 5)
										//starting index is 0 and end index is 4: 0,1,2,3,4
								//insert value;
				a[0]=5; 		a[1]=10; 		 a[2]=20; 			a[3]=30;   		a[4]=40;
				
		//IF WE DONT KNOW SIZE
				int b[]={50,100,200,300,400,500};
				
				
		//find the size
				System.out.println("length of a is -  " +a.length);
				System.out.println("length of b is -  " +b.length);
				System.out.println('\n');
				
		//READ VALUES---
				
		//WAY 1-specific value
				System.out.println("a[2]= " +a[2]);		System.out.println('\n');
				
		//WAY 2- simple/classic for loop
				for(int i=0;i<=4;i++)				//i<=4 or i<=a.length-1
				{									//i<5 or i<a.length
					System.out.println(a[i]);
				}										System.out.println('\n');
				
				for(int i=0;i<b.length;i++)
				{
					System.out.println(b[i]);
				}
												System.out.println('\n');
		//WAY 3-	advanced for loop
					for(int i:b)
					{
						System.out.println(i);
					}
	}
	
	
	
	public static void main(String[] args) 
	{
			Single_Dim_Array sda= new Single_Dim_Array();
			sda.object_array();						System.out.println('\n');
			
			sda.int_array();
		
	}

}
