package Collection;
/*
 * 7. Write a Java program to sort keys in a Tree Map by using a comparator.
8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
10. Write a Java program to get a reverse order view of the keys contained in a given map.
11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
12. Write a Java program to get the greatest key less than or equal to the given key.

13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.
14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
*/
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMap3 {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tmp=new TreeMap();
		tmp.put(65,"pink");
		tmp.put(35,"Green");
		tmp.put(40,"Black");
		tmp.put(80,"yellow");
		tmp.put(50,"blue");
		
		
		System.out.println(tmp);
		System.out.println("TreeMap");
		for(Entry<Integer,String> e:tmp.entrySet())
		{
			System.out.println(e.getKey()+" :>"+ e.getValue());
		}
		
		System.out.println("Tree map by using Comparator:"+tmp);
		
		System.out.println("Gretest key:"+tmp.lastKey());
		System.out.println("Least key:"+tmp.firstKey());
		System.out.println("reverse order:"+tmp.descendingMap());
		System.out.println("Gretest key less than or equal to given key:"+tmp.floorKey(93));
		
		System.out.println("strictly less than:"+tmp.headMap(40));//13Question
		//tree_map1.headMap(20, true)
		System.out.println("whose keys leass than a given key:"+tmp.headMap(35, true));//14Question
		System.out.println("least key strictly greater than the given key:"+tmp.higherKey(40));//15Question
		
		
	}

}
