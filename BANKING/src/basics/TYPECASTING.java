package basics;

public class TYPECASTING 
{
	public static void main(String[] args) {
	//Implicit conversion/ Widening / Casting down- converting a lower data type into a higher one.
	
	int x= 10;		System.out.println("int x= " +x);
	long y= x;		System.out.println("long y = " +y);
	double z=y;		System.out.println("double z= " +z);
	char ch='a';
	int d=ch;				System.out.println(d);
	
	
	System.out.println('\n');
	
	//Explicit conversion/ Narrowing/ Casting up-
	
	double c= 20;			System.out.println("double c= " +c);
	long b=(long)c;			System.out.println("long b = " +b);
	int a=(int) b;			System.out.println("int a= " +a);
	int e=97;
	char hc=(char) e;			System.out.println(hc);
	

	}
}
