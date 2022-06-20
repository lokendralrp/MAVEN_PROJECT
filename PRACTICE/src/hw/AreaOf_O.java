package hw;

public class AreaOf_O 
{ 
	//area of circle= pie* r*r

	static float pie=3.14f, area;
	int r=20;
	
	
	public void findArea()
	{
		area= pie* r*r;
		System.out.println("Area of Circle = "+area);
	}
	
	public static void main(String args[])
	{
		AreaOf_O cir = new AreaOf_O();
		cir.findArea(); //take r=20
		cir.r=10;
		cir.findArea();
		
		
	}
}
