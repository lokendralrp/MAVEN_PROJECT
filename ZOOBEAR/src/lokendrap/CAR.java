package lokendrap;

public class CAR extends VEHICLE
{
	String company; int speed;
	//CAR(){}
	
	CAR(String company, int speed)
	{
		super("GERMANY", 2021);
		this.company=company;
		this.speed=speed;
		System.out.println("COMPANY NAME- " +company +"; SPEED- " +speed);
	}
}
