package operator;

public class Shift_op {

	public static void main(String args[]) 
	{
		int x=12;		int Y=-45;		int z=45;				//left shift: b=a<<n;  b= a*2^n
		System.out.println("X<<1 = "+(x<<1));			
		//System.out.println("Y<<2 = "+(Y<<2));			//-45<<2=-180
		System.out.println("Z<<2 = "+(z<<2));			//45<<2=180
		System.out.println("Y<<x = "+(Y<<x));
		
		System.out.println();
														//Right shift: b= a>>n; b= a/2^n
		System.out.println("X>>1 = "+(x>>1));			
		//System.out.println("Y>>2 = "+(Y>>2));			//-45>>2= -12
		System.out.println("Z>>2 = "+(z>>2));			//45>>2= 11
		System.out.println("Y>>X = "+(Y>>x));
		
		System.out.println();
														//Unsigned right shift
		System.out.println("X>>>1 = "+(x>>>1));			//same as Y>>2
		System.out.println("Y>>>2 = "+(Y>>>2));			
		System.out.println("Z>>>2 = "+(z>>>2));			//same as z>>2
		System.out.println("Y>>>X = "+(Y>>>x));
	}
}
