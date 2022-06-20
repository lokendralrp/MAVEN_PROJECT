package strings_and_arrays;

public class DuplicateNumber 
{
	public static void main(String[] args) 
	{
		int count=0;
		int i;
		int a[]={2,3,2,4,5,6,7,2};
		
		for(i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if((a[i]==a[j]))
				{
					System.out.println(a[i]);
					count++;
				}
			}
		}		
		System.out.println("no. of repeatation is " +count);
	}

}
