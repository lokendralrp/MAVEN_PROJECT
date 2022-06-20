package flow_control;

public class Dowhile { /* do {
    // this code will keep execute atleast once.
    } While (condition)
	
*/
	int j= 1;
	
	public void demo()
	{
			do {
				System.out.println(j);
				j++;
				}while(j<=10);
	}
	
	public static void main(String[] args) 
	{
		Dowhile practice = new Dowhile();
		practice.demo();
		
	}
}
