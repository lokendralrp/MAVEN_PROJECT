package lokendrap;

//public class ANIMAL	------		//without abstract class we cant create abstract method

abstract class ANIMAL 
{
	abstract void eat();		//if there is an abstract method, class must be abstract type
	
	public void animal()
	{
		System.out.println("ANIMAL LIVES IN JUNGLE");
	}
}

abstract class LION extends ANIMAL //abstract class
{
	abstract void look();   //abstract method
	
	public void eat()
	{
		System.out.println("lion is a carnivorous animal. It eats meat");
	}
}


class lion_CUB extends LION
{
	public void look()
	{
		System.out.println("CUB looks very dangerous");
	}
}


class DOG extends ANIMAL 
{
	public void eat()
	{
		System.out.println("dog is omnivorous animal and it eats veg and non veg");
	}
}


class ZEBRA extends ANIMAL
{
	public void eat()
	{
		System.out.println("zebra is herbivorous animal and it eats grass");
	}
}


public class AbstractANIMAL 
{
	public static void main(String[] args) 
	{
		//ANIMAL aa = new ANIMAL();	-------		//cant instantiate abstract class
				// LION al=new LION ();
				 
		//STATIC BINDING	
				System.out.println("STATIC BINDING-----------");
				DOG ad= new DOG();
				ad.animal();
				ad.eat();
				
				lion_CUB alc= new lion_CUB ();
				alc.animal();
				alc.eat();
				alc.look();
				
				ZEBRA az = new ZEBRA ();
				az.animal();
				az.eat();
				
				System.out.println('\n');
		//DYNAMIC BINDING
				System.out.println("DYNAMIC BINDING-----------");
				ANIMAL an= new DOG();
				an.animal();
				an.eat();									System.out.println('\n');
				
				//ANIMAL an= new LION(); -----  //Abstract Class
			
				ANIMAL an1= new lion_CUB ();//if method is overridden, then only we can call child class method
				an1.animal();
				an1.eat();										System.out.println('\n');
				
				LION al= new lion_CUB ();
				 al.animal();
				 al.eat();
				 al.look();											System.out.println('\n');
				
				ANIMAL an2= new ZEBRA ();
				an2.animal();
				an2.eat();
	}
}


















