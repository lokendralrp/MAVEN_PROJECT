package lokendrap;

public class BIKE extends VEHICLE
{
	String brand; String bike; int engine;
	
	BIKE ()
	{
		super("JAPAN", 2020);
		brand = "Suzuki";
		bike = "Intruder";
		engine = 1300;
		System.out.println("BRAND- " +brand +"; BIKE- " +bike +"; ENGINE POWER- " +engine);
	}
}
