
package strings_and_arrays;

public class FindIndex 
{
	
	public static void main(String[] args) 
	{
		
		int a[]={12,34,56,78,90};
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==56)
			{
				System.out.println("INDEX OF 56 IS " +i +" and at " +(i+1) +"rd position");
			}
			
		}
	}

}
