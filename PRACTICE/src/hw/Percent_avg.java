package hw;

public class Percent_avg {

	double maths, physics, chemistry, english, hindi,
    max, subject, percentage, total, mark, avg;
	
	
	
	
	public void marks()
	{
	maths = 90; physics = 95; chemistry = 92; hindi = 75;
	english = 80; max = 100; subject = 5;
	}
	
	public void result()
	{
		total = maths+physics+chemistry+english+hindi;
		mark = max*subject;
		percentage = ((total/mark)*100);
		System.out.println("RESULTS OF 12th CLASS: ");
		System.out.println("MATHS= "+maths);
		System.out.println("PHYSICS= "+physics);
		System.out.println("CHEMISTRY= "+chemistry);
		System.out.println("ENGLISH= "+english);
		System.out.println("HINDI= "+hindi);
		System.out.println("TOTAL= "+total);
		System.out.println('\n');
		
		System.out.println("PERCENTAGE= "+percentage+"%");
	}
	
	
	public void avg()
	{
		avg= total/5;
		System.out.println("AVERAGE= " +avg);
	}
	
	public static void main(String[] args) {
		
		Percent_avg check= new Percent_avg();
		check.marks();
		check.result();
		System.out.println('\n');
		check.avg();
		
		
	}
	
	
	
	
	
	
}





