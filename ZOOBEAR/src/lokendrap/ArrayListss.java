package lokendrap;

import java.util.ArrayList;		//import this is necessary
import java.util.*;  
public class ArrayListss 
{
	
		public void allDataTypes()
		{
			ArrayList<Object> list = new ArrayList<>();
//adding values using add method---			 
			list.add("Deepak");
			list.add(25);
			list.add(7_99_98_87_654l);
			list.add('B');							
			
//size of arraylist using size method			
			System.out.println("Size of list --- "+list.size());				System.out.println('\n');
													
// get the element from the arraylist	
			System.out.print("Element at index 2: " +list.get(2));				System.out.println('\n');
													
//print values			
			System.out.println("values in list= "+list);						System.out.println('\n');
													
//remove an element			
			list.remove(2);
			System.out.println("size after removing(index-2) = " +list.size());
			System.out.println("values in list = "+list);						System.out.println('\n');
													
//inserting a new element			
			list.add(3, 8878899766l);
			System.out.println("size after adding new value(index 3) = " +list.size());
			System.out.println("values in list = "+list);						System.out.println('\n');
												
// change the element of the array list
			list.set(0, "Hari");
			System.out.println("modified list= " +list); 						System.out.println('\n');
//read values			
			for(Object ob:list)
			{
				System.out.println(ob);
			}																	System.out.println('\n');																																								
//Iterating ArrayList using Iterator:  traverse ArrayList elements using the Iterator interface.
			Iterator itr=list.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		
/*		
		public void intdataTypes()
		{
			ArrayList<Integer> list1 = new ArrayList<>();
		}
		
		
		void stringdataTypes()
		{
			ArrayList<String> list2 = new ArrayList<String>();
		}
*/
		
		public static void main(String[] args) 
		{
			ArrayListss al=new ArrayListss();
			al.allDataTypes();
			
		}




}
