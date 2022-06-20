package inheritance;

//super can be used to refer parent class instance variable
 class Animal
{
	
	 
	 int i=20;
	 String color="white";
}

class Dog extends Animal
{
	int i=30;
	String color="Black";
	void display()
	{
		System.out.println(super.color);
		System.out.println(color);
		System.out.println(super.color);
	}
	void value(int i)
	{
		System.out.println(i);		//value given in obj
		System.out.println(this.i);		//instance value
		System.out.println(super.i);		//value of parent class instance variable
	}
}






public class SuperKeyword1 
{
	public static void main(String[] args) 
	{
		Dog d= new Dog();
		d.display();
		d.value(40);
	}

}
