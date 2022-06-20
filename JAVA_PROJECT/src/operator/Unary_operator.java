package operator;		//Unary, Arithmetic, Shift, Relational, bitwise, logical, ternary, assignment

public class Unary_operator //increment, decrement with postfix & prefix
{
	public static void main(String args[]) 
	{
		
		int a=5;
		System.out.println(a++);				//a=5
												//a=6
		
		int c= a++;
		System.out.println("a= "+a +" & c= "+c);  //firstly write value (c=6) then add. so, a=7
		System.out.println(a++);		//a=7
		System.out.println(c);			//c=6
		
		System.out.println(a++);		//a=8
										//a=9
		System.out.println(++a);		//a=10
		System.out.println(--a);		//a=9
		System.out.println(a--);		//a=9
										//a=8
		int d=a--;
		System.out.println("a= "+a +" & d= "+d);		//d=8, a=7
		
		int e=++a;
		System.out.println("a= "+a +" & e= "+e);		//e=8, a=8
										
		
		a= a-- +a;						//a= (a--=7)+ (+a=8) {a-- =8 coz post dec. then next a=7}
		System.out.println(a);			//15

		
		a= a-- +2;						//15+2=17
		System.out.println(a);
		
		a= ++a +a;	
		System.out.println(a);
		
		a= --a -2;	
		System.out.println(a);
		
		a= ++a -a;	
		System.out.println(a);
	}

}
