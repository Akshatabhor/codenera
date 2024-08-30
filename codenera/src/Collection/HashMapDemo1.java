/*6. Write a Java program to get a shallow copy of a HashMap instance.
7. Write a Java program to test if a map contains a mapping for the specified key.
8. Write a Java program to test if a map contains a mapping for the specified value.
9. Write a Java program to create a set view of the mappings contained in a map.
10. Write a Java program to get the value of a specified key in a map.
11. Write a Java program to get a set view of the keys contained in this map.
12. Write a Java program to get a collection view of the values contained in this map
*/

package Collection;
import java.util.HashMap;
import java.util.Map.Entry;
public class HashMapDemo1 {

	public static void main(String[] args) 
	{
		HashMap <Integer,String> hm=new HashMap();
		hm.put(6, "java");
		hm.put(26, "Android");
		hm.put(43, "Html");
		hm.put(22, "c++");
		hm.put(16, "JavaScript");
		

		for(Entry<Integer, String> e:hm.entrySet())//view of mapping contain thats why entryset is used
		{
			System.out.println(e.getKey() +" = "+ e.getValue());
		}
		hm.clone();
		System.out.println("\nShallow Copy of Hashmap:"+hm);
		
		if(hm.containsKey(22))
		{
			System.out.println("\n22 key is present in Map");
		}
		else
		{
			System.out.println("22 key is not present in map");
		}
		if(hm.containsValue("Html"))
		{
			System.out.println("\nHtml Value is Present");
		}
		else
		{
			System.out.println("Html value is Not present");
		}
		
		System.out.println("\nSet of View of mapping:");
		for(Entry<Integer, String> e:hm.entrySet())
		{
			System.out.println(e.getKey() +" "+ e.getValue());
		}
		System.out.println("\nget the value of specified key:"+hm.get(26));
		
		System.out.println("\nget a set view of key:"+hm.keySet());
		
		System.out.println("\nget a set view of value:"+hm.values());
	}

}
