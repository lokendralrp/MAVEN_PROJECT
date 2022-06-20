package student;

class THISTEST			
{
	void m1(THISTEST t)
	{
		System.out.println("method m1");
	}
	
	void m2()
	{											//used to pass as an argument in the method call
		m1(this);
		//m1();
		this.m1(this);
	}	
}


class THISTEST1	
{	
	THISTEST1(THIS_KEYWORD_USES d)				//used to pass as an argument in the constructor call
	{											//m3() method for constructor call
		System.out.println("constructor");
	}
}


class THIS_TEST							//used to return the current class instance from  the method
{
	THIS_TEST m4()
	{
		System.out.println("method m4");
		return this;
	}
}




public class THIS_KEYWORD_USES 
{
	void m3()
	{
		THISTEST1 tt=new THISTEST1(this);
	}
	
	public static void main(String[] args) 
	{
		THISTEST t=new THISTEST();
		t.m2();
		
		THIS_KEYWORD_USES tku=new THIS_KEYWORD_USES ();//call constructor
		tku.m3();
		
		THIS_TEST tt= new THIS_TEST();
		tt.m4();

	}
}
