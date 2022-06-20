package hw;

public class Add2obj {

	int a,b, sum;
	int c=18, d=32, sum1;
	
	public void add(){
		sum= a+b;
		sum1= c+d;
		System.out.println("ANSWER= "+sum);
		System.out.println("ANSWER1= "+sum1);
	}
	
	public static void main(String [] args)
	{
		Add2obj plus= new Add2obj();
		Add2obj plus1= new Add2obj();
		plus.a=14;
		plus.b=16;
		
		plus.add();
		plus1.add();
		
	}
}
