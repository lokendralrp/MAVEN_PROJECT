package you_tube;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Literals 
{			//INTEGRAL, FLOATING POINT,BOOLEAN, CHAR LITERAL

//decimal literal
	public void dec_lit()		
	{
		int a=10; 
		int xa=a;
		//int xb=b;
		//int g=9999999999;			// literal out of range
		//int b=10L;				//cant convert from long to int
		//int u=10.0;				//integral cant be float
		
		System.out.println(+a+"---"+xa);
	}
	
//octal form: 0-7
	public void oct_lit()			
	{
		int c=010, d=0100,e=0777;		
		//int f=0786;					//out of range
		
		System.out.println(+c+"___"+d+"___"+e);
		//System.out.println(f);
	}
	
//hexa decimal form 0-9, a-f/A-F
	public void hexa_dec_lit() 			
	{
		int h=0x10,  i=0X100;			
		int j= 0xFace, k=0xbeef;
		//int l= 0xbear;		 //Unresolved compilation problem: 
								//Syntax error on token "r", delete this token
		System.out.println(+h+"___"+i+"___"+j+"___"+k);
	}
	
	
//floating point literal
	public void f_p_lit() 	
	{
		float m=123.456F; 
		//float n=123.456;		//cant convert from double to float('f' suffix)
		double o=123.456d,  p=0123.456;
		double q =0777, s=0xFace; 		//by default integral
		//double r=0786;
		//double t=0Xface.0;		//f.p. cant be hexa
		double v=1.2e3;		  		//exponential form
		float w=1.2e3f;
		float fa=10l;
		
		System.out.println(+m+"---"+o+"---"+p+"---"+q+"---"+s+"---"+v+"---"+w+"---"+fa);
	}
	
	
//BOOLEAN LITERAL
	public void b_lit() 
	{
		//boolean ab=0;		//cant convert int to boolean
		//boolean x=True;		//True cant resolved to a variable
		//boolean y="True";	//cant convert from string to boolean
		//boolean z='true';
	}
	
	public void char_lit() 		//CHARACTER LITERAL(only single char)
	{
		char cd='a';
		//char de=b;
		//char ef="c";
		//char fg='ab';
		char gh=97;
		char lm=197;
		char mn=1970;
		char hi=0xface;
		char ij=0777;
		char jk=65535;
		//char kl=0786;
		//char no=0xbear;
		char ch='\u0061';		//unicode representation
								//4 digit hexa decimal 
		char pq='\uface';
		//char qr=\uface;
		//char rs='\iface';		//Escape char \n,\t,\r,\b etc.
		char st='\n';			//new line
		char tu=80;
		
		System.out.println(+cd+"---"+gh+"---"+lm+"---"+mn+"---"+hi+"---"+ij+"---"+jk+"---"+ch+"---"+pq+"---"+st);
		System.out.println(tu);
	}
	
//BINARY LITERAL
	public void bin_lit()
	{
	    int ba=0b1111;
	    int bd=0B100;
	    int be=0b01;
	    
	    System.out.println(ba+"---"+bd+"---"+be);
	}
	
//NUMERIC LITERAL
	public void num_lit()
	{
		double nb=1_2_3__456.7__89;
		int na=1_010_101_010;
		int nc=1_01_01_01_010;
		//double nd=123_456_.789;			//underscores only within digits
		System.out.println(nb+"---"+na+"---"+nc);
	}
	

	public static void main (String[] args)
	{
		Literals result= new Literals();
		result.dec_lit();
		result.oct_lit();
		result.hexa_dec_lit();
		result.f_p_lit();
		result.b_lit();
		result.char_lit();
		result.bin_lit();
		result.num_lit();
		
		
	
	}	
	
}
