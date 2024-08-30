package Collection;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMap1 {

	public static void main(String[] args)
	{
		TreeMap<Integer,String> tmp=new TreeMap<>();
		tmp.put(60,"java");
		tmp.put(40,"Html");
		tmp.put(20,"c++");
		tmp.put(30,"Android");
		tmp.put(80,"CSS");
		tmp.put(80, null);
		tmp.put(50, null);
		
		//System.out.println(tmp);
		System.out.println("TreeMap:");
		for(Entry<Integer, String> e:tmp.entrySet())//using iterator
		{
			System.out.println(e.getKey() +" :> "+ e.getValue());
		}
		
	
		System.out.println("ceiling method:"+tmp.ceilingKey(45));//it returns greter value to given key
		
		if(tmp.containsKey(70))
		{
			System.out.println("key is present");
		}
		else
		{
			System.out.println("key is not present");
		}
		if(tmp.containsValue("c++"))
		{
			System.out.println("value is present");
		}
		else
		{
			System.out.println("value is not present");
		}
		
		System.out.println("decending order key:"+tmp.descendingKeySet());
		System.out.println("decending order kay and value:"+tmp.descendingMap());
		
		
		System.out.println("First Entry:"+	tmp.firstEntry());
		System.out.println("Last entry:"+tmp.lastEntry());
		

	}

}
