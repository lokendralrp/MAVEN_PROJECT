package lokendrap;

public class BMW extends CAR
{
	String model, type, transmission; int price;
	
	BMW()
	{
		super("BMW", 250);
		model= "Z4 Roadster";
		type="Coupe";
		transmission= "Automatic";
		price = 8000000;
		System.out.println("MODEL- " +model +"; TYPE- " +type +"; TRANSMISSION- " +transmission +"; PRICE- " +price);
	}
}
