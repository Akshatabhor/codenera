package Collection;
/*1. Write a Java program to associate the 
specified value with the specified key in a Tree Map.
 * 2. Write a Java program to copy Tree Map's content to another Tree Map.
 * 3. Write a Java program to search for a key in a Tree Map.
4. Write a Java program to search for a value in a Tree Map.
5. Write a Java program to get all keys from a Tree Map.

6. Write a Java program to delete all elements from a Tree Map.
*/
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMap2 {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tmp=new TreeMap();
		tmp.put(35,"Green");
		tmp.put(40,"Black");
		tmp.put(80,"yellow");
		tmp.put(65,"pink");
		tmp.put(50,"blue");
		
		System.out.println("TreeMap");
		for(Entry<Integer,String> e:tmp.entrySet())
		{
			System.out.println(e.getKey()+" :>"+ e.getValue());
		}
		System.out.println("\nCopy TreeMap:"+tmp.clone());
		tmp.put(70, "White");
		System.out.println("\n Add Specified value and key in TreeMap"+tmp);
		
	
		if(tmp.containsKey(80))
		{
			System.out.println("\nkey is present in TreeMap");
		}
		else
		{
			System.out.println("Key is not present in Treemap");
		}
		if(tmp.containsValue("orange"))
		{
			System.out.println("\n value is present in TreeMap");
		}
		else
		{
			System.out.println("\nvalue is Not present in TreeMap");
		}
		System.out.println("\nAll Keys:"+tmp.keySet());
		
		tmp.clear();
		System.out.println("\n Delete All Element:"+tmp);
		
	}

}
