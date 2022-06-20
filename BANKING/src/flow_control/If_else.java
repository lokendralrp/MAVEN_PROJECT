package flow_control;

public class If_else 
{
	int a=10, b=20, c=51, year=2020;
	int marks=65;  
	
	public void find_greater()
	{
		if(a>b && a>c)
			System.out.println("a is greater");
		else if (b>a && b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");
	}	
	
//TERNARY OPERATOR
	
	public void ternary()
	{
		System.out.println(" 'TERNARY OPERATOR' ");
		//return a>b? a:b; 		//void method cant return value
		System.out.println(a>b? a:b);
		
		String output=(c%2==0)?"even number":"odd number";
		System.out.println(output);
		
		String output1=(b%2==0)?"even number":"odd number";
		System.out.println(output1);
	}	
	
	public void oddeven()
	{
		if (a%2==0)
			System.out.println("EVEN NUMBER");
		else
			System.out.println("ODD NUMBER");
	}
	
	public void leapyear()
	{
		if(((year%4==0) && (year%100!=0)) || (year%400==0))
			System.out.println("LEAP YEAR");
		else
			System.out.println("COMMON YEAR");
	}
	
	public void ifelseladder()		//showing grade
	{ 
		if(marks<35){  
			System.out.println("fail");  
			}
	     
	    else if(marks>=35 && marks<40){  
	        System.out.println("D grade");  
	    }  
	    else if(marks>=41 && marks<55){  
	        System.out.println("C grade");  
	    }  
	    else if(marks>=55 && marks<65){  		//if we take 65 marks, output=invalid
	        System.out.println("B grade");  
	    }  
	    else if(marks>=66 && marks<85){  
	        System.out.println("A grade");  
	    }
	    else if(marks>=85 && marks<100){  
	        System.out.println("A+ grade");  
	    }
	    else{  
	        System.out.println("Invalid!");  
	    } 
	}	
	
	
//NESTED IF ELSE  
	public void nestedifelse()
	{	
		 //Creating two variables for age and weight  
	   int age=20;  
	     int weight=80;    
			     //applying condition on age and weight  
	   if(age>=18){    
	     if(weight>50){  
	     System.out.println("You are eligible to donate blood"); 
	     }
	   }
	}		             
			          
		
	public static void main(String[] args) 
	{
		If_else demo= new If_else();
		demo.find_greater(); 
		System.out.println('\n');
			
		demo.ternary();
		System.out.println('\n');
		demo.oddeven();
		System.out.println('\n');
		demo.leapyear();
		System.out.println('\n');
		demo.ifelseladder();
		System.out.println();
		demo.nestedifelse();
	
		
	
		
		
		
		
/*	{
		int age = 20;
		if (age >=18)
		{
			System.out.println("VALID");
		}
		else 
		{
			System.out.println("INVALID");
		}

	}
*/

		
/*		int x=0;
		if (x)			//cannot convert from int to boolean
*/		
		
		
		
		
		
		
		
		
		
		

	}
	

}	
	