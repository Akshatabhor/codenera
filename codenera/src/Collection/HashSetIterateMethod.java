package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterateMethod {

	public static void main(String[] args) 
	{
		HashSet ob=new HashSet();
		ob.add(34);
		ob.add(48);
		ob.add(16);
		ob.add(10);
		ob.add(18);
	
		System.out.println("Hashset iterate:"+ob);
		
		Iterator I=ob.iterator();

		while(I.hasNext());
		{
			System.out.println(I.next());
		}
		
	}

}
