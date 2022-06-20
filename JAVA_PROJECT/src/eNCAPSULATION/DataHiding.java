package eNCAPSULATION;

class Account
{
	private long acc_no, mobile_no;
	private String name, email;
	private float amount;
//acc no	
	public void setAcc_no(long acc_no)
	{
		this.acc_no=acc_no;
	}
	public long getAcc_no()
	{
		return acc_no;
	}
//mobile no	
	public void setMobile(long mobile_no)
	{
		this.mobile_no=mobile_no;
	}
	public long getMobile()
	{
		return mobile_no;
	}
//name	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
//email	
	public void setEmail(String email)
	{
		this.email= email;
	}
	public String getEmail()
	{
		return email;
	}
//amount	
	public void setAmount(float amount)
	{
		this.amount=amount;
	}
	public float getAmount()
	{
		return amount;
	}	
}


//READ ONLY CLASS-- which has only getter methods-- we cant change value later.
class Account1
{
	private String bankName= "UBI";
	
	public String getbankName()
	{
		return bankName;
	}
}



//WRITE ONLY CLASS-- which has only setter methods-- you cant get the value later
class Account2
{
	private String branchname="new market";
	
	public void setbranchname(String branchname)
	{
		this.branchname=branchname;
	}
}


public class DataHiding
{
	public static void main(String[] args) 
	{
		Account ac= new Account();
		ac.setAcc_no(49204150512656l);
		ac.setName("Umar Khalid");
		ac.setMobile(8898867788l);
		ac.setEmail("armanm.1@gmail.com");
		ac.setAmount(500000f);
	
		System.out.println(ac.getAcc_no() +" " +ac.getName() +" " +ac.getAmount());
		System.out.println(ac.getMobile() +" " +ac.getEmail());
		System.out.println('\n');

//READ ONLY		
		Account1 ac1= new Account1();
		//ac1.setbankName("SBI");    //WE CANT CHANGE VALUE
		System.out.println("bank name - " +ac1.getbankName());
		System.out.println('\n');
		
//WRITE ONLY CLASS		
		Account2 ac2= new Account2();
		ac2.setbranchname("NEHRU NAGAR");				//we can only change it but
		//System.out.println(ac2.getbranchname());		//we cant access the value
		
	}

}
