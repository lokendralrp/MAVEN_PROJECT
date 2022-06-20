package lokendrap;

public class VEHICLE 
{
	//VEHICLE(){}
	
	String origin; int year;
	
	VEHICLE(String origin, int year)
	{
		this.origin=origin;
		this.year=year;
		System.out.println("MADE IN- " +origin +"; MANUFACTURING YEAR- " +year);
	}
}
