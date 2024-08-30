package Collection;
/*16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
18. Write a Java program to get a NavigableSet view of keys in a map.
19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.
20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive) to another key (exclusive).
22. Write a Java program to get the portion of a map whose keys range from a given key to another key.
23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
24. Write a Java program to get a portion of a map whose keys are greater than a given key.
25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
*/
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMap4 {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tmp=new TreeMap();
		tmp.put(65,"pink");
		tmp.put(35,"Green");
		tmp.put(40,"Black");
		tmp.put(80,"yellow");
		tmp.put(50,"blue");
		
		
		
		System.out.println("TreeMap:");
		for(Entry<Integer,String> e:tmp.entrySet())
		{
			System.out.println(e.getKey()+" :>"+ e.getValue());
		}
		
		System.out.println("\nget a key-value mapping associated with the greatest key strictly less than the given key:"+tmp.lowerEntry(39));
		System.out.println("\ngreatest key strictly less than the given key:"+tmp.lowerKey(55));
		System.out.println("\nNavigable view of key:"+tmp.keySet());
		System.out.println("\nRemove Least key in map and get key-value:"+tmp.pollFirstEntry());
		System.out.println(tmp);
		System.out.println("\nRemove Gretest kay in map and get key-value:"+tmp.pollLastEntry());
		System.out.println(tmp);
		System.out.println("\nget the portion  range from a given key (inclusive) to another key (exclusive):"+tmp.subMap(35, 80));
		System.out.println("\nGet the portion of map keys range from a given key to another key:"+tmp.subMap(40, true, 80, true));
		System.out.println("\nkeys are greater than or equal to a given key:"+tmp.tailMap(50));
		System.out.println("\nkeys are greater than a given key:"+tmp.tailMap(50, false));
		System.out.println("\nget key-value least key greater than or equal to the given key:"+tmp.ceilingEntry(65));
		System.out.println("\nget keyleast key greater than or equal to the given key:"+tmp.ceilingKey(65));
		
	}

}
