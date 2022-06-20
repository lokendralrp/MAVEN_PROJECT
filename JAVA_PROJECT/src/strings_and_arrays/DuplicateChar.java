package strings_and_arrays;

public class DuplicateChar 
{
	public static void main(String[] args) 
	{  
        String s = "this is Lokendra Patel";  
        int count;  
        char ch[] = s.toCharArray();   //Converts given string into character array            
        System.out.println("Duplicate characters in a given string: ");  
       
        for(int i = 0; i <ch.length; i++) 		 //Counts each character present in the string  
        {  
            count = 1;  
            for(int j = i+1; j <ch.length; j++) 
            {  
                if(ch[i] == ch[j] && ch[i] != ' ') 
                {  
                    count++;                      
                    ch[j] = '0';   //Set ch[j] to 0 to avoid printing visited character 
                }  
            }              
            if(count > 1 && ch[i] != '0')   //A character is considered as duplicate if count is greater than 1
                System.out.println(ch[i]);  
        }  
    }  

}
