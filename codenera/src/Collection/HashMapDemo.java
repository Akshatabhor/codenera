/*1. Write a Java program to associate the specified value with the specified key in a HashMap.
2. Write a Java program to count the number of key-value (size) mappings in a map.
3. Write a Java program to copy all mappings from the specified map to another map.
4. Write a Java program to remove all mappings from a map.
5. Write a Java program to check whether a map contains key-value mappings (empty) or not.*/

package Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		HashMap <Integer,String> hm=new HashMap();
		hm.put(6, "java");//output will mod of 16 to integer no that basis will output
		hm.put(26, "Android");
		hm.put(43, "Html");
		hm.put(22, "c++");
		hm.put(16, "JavaScript");
		
		System.out.println(hm);
		System.out.println("HashMap Iteration:");
		for(Entry<Integer, String> e:hm.entrySet())
		{
			System.out.println(e.getKey() +" :> "+ e.getValue());
		}
		
		
		System.out.println("\ncount the number of key value:"+hm.size());
		
		HashMap <Integer,String> hm1=new HashMap();
		hm1.put(6, "red");//output will mod of 16 to integer no that basis will output
		hm1.put(26, "pink");
		hm1.put(43, "white");
		hm1.put(22, "black");
		hm1.put(16, "violet");
		
		System.out.println(hm1);
		
		 hm1.putAll(hm);
	     System.out.println("After copying specified map into another map: " + hm1);
	     
	     hm.clear();
	     System.out.println("Remove All Maping From Map:"+hm);
	     
	     boolean Empty=hm.isEmpty();
	     System.out.println(Empty);
	     /*if(Empty)
	     {
	    	 System.out.println("Map is Empty");
	     }
	     else
	     {
	    	 System.out.println("Map is Not Empty");
	     }*/
	    		 
	}

}
