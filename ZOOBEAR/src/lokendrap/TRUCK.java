package lokendrap;

public class TRUCK extends VEHICLE
{
	String type, company, country; 
	
	TRUCK()
	{
		super("INDIA", 2022);
		type="Cargo";
		company = "Tata";
		country = "Japan";
		System.out.println("TYPE- " +type +"; COMPANY- " +company +"; TRANSPORT IN- " +country);
	}
}
