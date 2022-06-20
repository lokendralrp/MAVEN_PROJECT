package basics;

public class TEST10MARCH 
{
	public void midelement()		//que 1
	{
		String s="MADAN";
		System.out.print("middle element in  " +s +"=  ");
		char ch[]=s.toCharArray();
		int mid=ch.length/2;
		
		if(mid%2!=0)
		{
			System.out.println(ch[mid]);
		}
		else
		{
			System.out.println(ch[mid]);
		}
	}

	
	public void addition()		//que. 2
	{
		int sum=0;
		int a[][]= {{1,2}, {3,4}};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				sum=sum+a[i][j];
			}
		}
		System.out.println("TOTAL ADDITION OF ARRAY= " +sum);
	}
	
	
	public void deleteconst()
	{
		String s="this is lokendra patel";
		
		String vowel= s.replaceAll("[bcdfghjklmnpqrstvwxyz]" ,"");
		System.out.println("String after removing consonant: " +vowel);
	}
	
	
	
	public void commonelement()			//que 4
	{
		System.out.println("Common elements are : ");
		int[] a = {1,2,1,4,5,6,7,8,9};
	    int[] b = {1,3,5,7,9};
	 
	        x: for (int i = 0; i < a.length; i++)
	        {
	        	if(i>0)
	        	{
	        	     for(int k=0; k<i; k++)				//BACKWARD PARSING
	        	     {
	        	    	 if(a[k]==a[i])
	        	    	 {
	        	    		 continue x;
	        	    	 }
	        	     }	 
	        	}   	      	    	 
	        	    		 for (int j = 0; j < b.length; j++) 		//FORWARD PARSING
	        		            {
	        		                if(a[i] == (b[j]))
	        		                {	       
	        		                 System.out.println((a[i]));
	        		                }
	        		            }
	        	    	 
	        	
	        }
	            
	           
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		TEST10MARCH tm= new TEST10MARCH();
		tm.midelement();	 		System.out.println('\n');
		tm.addition(); 				System.out.println('\n');
		tm.deleteconst(); 			System.out.println('\n');
		tm.commonelement();
	}

}
