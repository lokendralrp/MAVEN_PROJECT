package student;

//FINAL METHOD 
class Bike
{
	final void run()
	{
		
	}
}
class Honda extends Bike
{
	//void run()				//FINAL METHOD CANT OVERRIDE IN OTHER CLASS
	{
		
	}
}

//FINAL CLASS CANT INHERITED
 class Vehicle
{
	
}
/*
class Car extends Vehicle
{
	
}
*/


public class FinalKeyword 
{
	final int speed=40;
	
	void display()
	{
		//speed++;			//final variable cant incremented
		int speed=50;				//local variable: only inside the block
		System.out.println(speed);
	}
	
	public static void main(String[] args) 
	{
		FinalKeyword demo=new FinalKeyword ();
		//demo.speed=100;						//value of final variable cant change
		System.out.println(demo.speed);
		demo.display();
	}

}
