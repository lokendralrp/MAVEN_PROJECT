package basics;
import accessModifier.Protected;

public class ProtectedTest extends Protected 
{
	public static void main(String[] args) 
	{
		Protected pr =new Protected();		//we can call protected method only with child class instance
		//pr.month();						
											//as shown below---
		
		ProtectedTest pt=new ProtectedTest();
		pt.month();
		System.out.println(pt.d);
		System.out.println(pt.d=100);
	}
	

}
