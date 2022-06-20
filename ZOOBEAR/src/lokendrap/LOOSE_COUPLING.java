package lokendrap;

/*
 * LOOSE COUPLING:-
 * 
 * 
 */

interface KEYBOARD
{
	String display();
}

class DELLKB implements KEYBOARD
{
	String info;
	public String display()
	{
		return info="THE DELL KEYBOARD";
	}
}

class LENOVOKB implements KEYBOARD
{
	String info;
	public String display()
	{
		return info="THE LENOVO KEYBOARD";
	}
	
}


class COMPUTER					//here this class is not tightly coupled to any type of keyboard class
{
	public void keyboardused(KEYBOARD k)
	{
		System.out.println("the computer is using " +k.display());
	}	
}

class COMPUTER1				//here this class is tightly coupled with dellkb class, we cant invoke 
{								//lenovokb class method with this class object
	public void keyboardused(DELLKB dlk)
	{
		System.out.println("the computer is using " +dlk.display());
	}
}

public class LOOSE_COUPLING 
{
	public static void main(String[] args) 
	{
//for computer class		
		COMPUTER c=new COMPUTER();
		
		DELLKB dk=new DELLKB();
		c.keyboardused(dk);
				
		LENOVOKB lk=new LENOVOKB();
		c.keyboardused(lk);
		
		
//for computer1 class
		COMPUTER1 c1 = new COMPUTER1();
		
		DELLKB dk1=new DELLKB();
		c1.keyboardused(dk1);
		
//		LENOVOKB lk1=new LENOVOKB();
//		c1.keyboardused(lk1);
		
	}
}



