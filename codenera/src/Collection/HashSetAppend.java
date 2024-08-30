/*1. Write a Java program to append the specified element to the end of a hash set.
 * 3. Write a Java program to get the number of elements in a hash set.
 * 5. Write a Java program to test if a hash set is empty or not.
4. Write a Java program to empty an hash set.



*/
package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetAppend {

	public static void main(String[] args) 
	{
		HashSet ob=new HashSet();
		ob.add(11);
		ob.add(12);
		ob.add(13);
		System.out.println(ob);
		
		ob.add(15);
		System.out.println("append the specified element:"+ob);
		
		int getsize=ob.size();
		System.out.println("element in HashSet:"+getsize);
		
	System.out.println("isEmpty:"+ob.isEmpty());
	ob.clear();
	System.out.println(ob);
	}

}
