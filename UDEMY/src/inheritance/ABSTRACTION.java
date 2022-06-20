package inheritance;

abstract class Vehicle
{
	abstract void start();
}

class CAR extends Vehicle
{
	void start()
	{
		System.out.println("car starts with key");
	}
}

class BIKE extends Vehicle
{
	void start()
	{
		System.out.println("bike starts with kick");
	}
}

public class ABSTRACTION 
{
	public static void main(String[] args) 
	{
		CAR car= new CAR();
		car.start();
		BIKE bike = new BIKE();
		bike.start();
	}
}