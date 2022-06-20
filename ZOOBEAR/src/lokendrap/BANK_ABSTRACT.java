package lokendrap;

abstract class BANK
{
	abstract void bank();
	abstract double rateOfInt();
}

class SBI extends BANK
{
	double rateOfInt()
	{
		return 6.5;
	}
	
	void bank()
	{
		System.out.print("I m in SBI bank and rate of interst is  ");
		//System.out.println(rateOfInt());
	}
}


class ICICI extends BANK
{
	double rateOfInt()
	{
		return 7.6;
	}
	
	void bank()
	{
		System.out.print("I m in ICICI bank and rate of interst is  ");
		//System.out.println(rateOfInt());
	}
}


class UBI extends BANK
{
	double rateOfInt()
	{
		return 7.1;
	}
	
	void bank()
	{
		System.out.print("I m in UBI bank and rate of interst is  ");
		//System.out.println(rateOfInt());
	}
}





public class BANK_ABSTRACT 
{
	public static void main(String[] args) 
	{
		System.out.println("STATIC BINDING............................");
		SBI sbi = new SBI();
		sbi.bank();
		System.out.println(sbi.rateOfInt());
		
		ICICI icici = new ICICI();
		icici.bank();
		System.out.println(icici.rateOfInt());
		
		UBI ubi =new UBI();
		ubi.bank();
		System.out.println(ubi.rateOfInt());
		
		System.out.println('\n');
		System.out.println("DYNAMIC BINDING............................");
		
		BANK bank=new SBI();
		bank.bank();
		System.out.println(bank.rateOfInt());
		
		bank=new ICICI();
		bank.bank();
		System.out.println(bank.rateOfInt());

		bank = new UBI();
		bank.bank();
		System.out.println(bank.rateOfInt());
	}

}
