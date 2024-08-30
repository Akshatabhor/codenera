package Collection;
/*1. Write a Java program to associate the specified value with the 
 * specified key in a LinkedHash Map.
 * 2. Write a Java program to copy  LinkedHash's content to another  LinkedHash Map.
3. Write a Java program to search for a key in a  LinkedHash Map.
4. Write a Java program to search for a value in a  LinkedHash Map.
5. Write a Java program to get all keys from a  LinkedHash Map.
6. Write a Java program to delete all elements from a  LinkedHash Map.
8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a  LinkedHash map.
9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
10. Write a Java program to get a reverse order view of the keys contained in a given map

*/
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LinkHashMap1 {

	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> LHM=new LinkedHashMap<>();
		LHM.put(20,"java");
		LHM.put(80,"simple");
		LHM.put(50,"programming");
		LHM.put(90,"language");
		LHM.put(40,"Application");
		
		System.out.println(LHM);
		
		System.out.println("\nLinkHashMap:");
		for(Entry<Integer, String> e:LHM.entrySet())
		{
			System.out.println(e.getKey() +":>"+ e.getValue());
		}
		
		/*LHM.put(60, "Structure");
		System.out.println("\nSpecified key and Value:"+LHM);
		
		System.out.println("\nCopy content to LinkHashMap:"+LHM.clone());
		
		System.out.println("\nSearch key in LinkHashMap:"+LHM.containsKey(90));
		System.out.println("\nSearch value in LinkHashMap:"+LHM.containsValue("oop"));
		System.out.println("\nGet All Keys:"+LHM.keySet());
		LHM.clear();
		System.out.println("\nDelete All Element"+LHM);*/
		
		TreeMap<Integer,String> tm=new TreeMap<>(LHM);
		System.out.println("\nLowest key");
		System.out.println(tm.firstKey());
		
		System.out.println("Gretest key:");
		System.out.println(tm.lastKey());
		System.out.println("\nReverse order keyset:"+tm.descendingKeySet());

			

	}

}
