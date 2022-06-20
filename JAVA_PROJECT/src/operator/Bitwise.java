package operator;

public class Bitwise {
	
/* 1. bitwise and; a&b; it returns 1 if both bits are 1
 * 2. bitwise or; a|b; it returns 1,if either of the bit is 1
 * 3. bitwise xor; a^b; it returns o if both bits are same, else returns 1
 * 4. bitwise compliment; returns the inverse
 */

	public static void main(String args[])
	{
		int a=5, b=10, c=15;
		
		System.out.println(a&b);			//0101 & 1010		=0000= 0
		System.out.println(a|b);			//0101 | 1010		=1111= 15
		System.out.println(a^b);			//0101 ^ 1010		=1111= 15
		System.out.println(~(a&b));			//~(0101 & 1010)	=
		System.out.println(~(a));			//~0101				=1010= 
		
		System.out.println('\n');
		
		System.out.println(a<b && b<c);			
		System.out.println(a<b && b>c);
		System.out.println(a>b && b<c);
		System.out.println(a>b && b>c);
		
		
	}
}
