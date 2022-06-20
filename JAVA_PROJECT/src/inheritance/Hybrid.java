package inheritance;

class ONE
{
	int a=100;
	void m1()
	{
		System.out.println("this is m1 from class one");
	}
}

interface ONEs
{
	void m2();
}

interface TWOs
{
	void m3();
}

public class Hybrid extends ONE implements ONEs,TWOs
{
	
	public void m2()
	{
		System.out.println(super.a);
		System.out.println("this is interface method m2 ");
	}
	
	public void m3()
	{
		System.out.println("this is interface method m3 ");
	}
	
	
	public static void main(String[] args) 
	{
		Hybrid hy=new Hybrid();
		System.out.println("this is HYBRID INHERITANCE" +'\n');
		hy.m1();
		hy.m2();
		hy.m3();
		System.out.println(hy.a=300);
		
	}

}
