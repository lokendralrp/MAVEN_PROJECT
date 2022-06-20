package student;

public class ThisKeyword 
{
	int a, b,  x=101,y=111;
	void get(int a, int b)
	{
		System.out.println(+a +" " +b);
	}
	
	void get1(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(this.a +" " +this.b);
		System.out.println(+a +" " +b);
		System.out.println(this.a +" " +this.b);
	}

	void get2(int x , int y)
	{
		System.out.println(+x +" " +y);
		System.out.println(this.x +" " +this.x) ;		//instance value of x and y
		System.out.println(this.a +" " +this.b) ;		//last instance value of a & b
	}
	
	
	void get3(int x , int y)
	{
		this.x=x;
		this.y=y;
		System.out.println(this.x +" " +this.y) ;
		System.out.println(+x +" " +y);	
	}
	
	void get4(int x , int y)
	{
		this.x=22; this.y=33;
	
		System.out.println(+x +" " +y);
		System.out.println(+this.x +" " +this.y);
	}
	
	public static void main(String[] args) 
	{
		ThisKeyword tk=new ThisKeyword ();
		tk.get(11, 22);
		System.out.println("----------");
		
		tk.get1(15, 20);
		System.out.println("----------");
		
		tk.get2(30, 40);
		System.out.println("----------");
		
		tk.get3(55,66);
		System.out.println("----------");
		
		tk.get4(80, 400);
	}
	
}
