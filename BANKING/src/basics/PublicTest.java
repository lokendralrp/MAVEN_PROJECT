package basics;
import accessModifier.Public;

public class PublicTest 
{
	public static void main(String[] args) 
	{
		Public pu=new Public();
		pu.days();
		System.out.println(pu.x);
		System.out.println(pu.x=200);
	}

}
