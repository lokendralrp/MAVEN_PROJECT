package lokendrap;
import java.util.*;

public class HaspMapss 
{
	public void hashmap()
	{
		HashMap <Integer,String> map=new HashMap <Integer,String>();
		
//ADDING PAIRS....
		map.put(111, "ramiz");
		map.put(222, "");
		map.put(null, "manish");
		map.put(444,"rasid");
		map.put(555, "");
		map.put(null, "ratnesh");		//two null keys, return only 1 null key,value
		map.put(111, "anshu");			//duplicate value, return only 1 duplicate key,value
		map.put(888, "shipra");
		System.out.println("values in hashmap are...  "+map);			System.out.println('\n');
		
//REMOVE A PAIR....
		map.remove(444);		//key based
		map.remove("shipra");		//value based
		map.remove(222, "");			//key-value based
		System.out.println("values in hashmap after removing  "+map);			System.out.println('\n');
		
//READING PAIRS
		System.out.println("iterating Hashmap....");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() +" " +m.getValue());
		}
		System.out.println('\n');
		
//REPLACE VALUES
		map.replace(111, "wazir");
		map.replace(888, "shipra", "girish");
		
		System.out.println("values after replacing= "+map); 					System.out.println('\n');
		
//ADDING VALUES
		map.put(666, "girish");
		System.out.println("values in hashmap are...  "+map);			System.out.println('\n');
		
//putAll() ,replaceAll() method		
		HashMap <Integer,String> map1=new HashMap <Integer,String>();
		map1.put(777, "shristi");
		map1.putAll(map);
		map1.replaceAll((k,v)-> "anamika");
		
		System.out.println("After invoking putAll() & replaceAll()....");
		for(Map.Entry m:map1.entrySet())
		{
			System.out.println(m.getKey() +" " +m.getValue());
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		HaspMapss hm=new HaspMapss ();
		hm.hashmap();
	}

}
