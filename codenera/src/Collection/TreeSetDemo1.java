/*1. Write a Java program to create a tree set, add some colors (strings) 
 * and print out the tree set.
 * 2. Write a Java program to iterate through all elements in a tree set.
3. Write a Java program to add all the elements of a specified tree set to another 
tree set.
4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
5. Write a Java program to get the first and last elements in a tree set.
6. Write a Java program to clone a tree set list to another tree set.
7. Write a Java program to get the number of elements in a tree set.
8. Write a Java program to compare two tree sets.


*/

package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args)
	{
		TreeSet<String> obj=new TreeSet();
		obj.add("Pink");
		obj.add("Red");
		obj.add("Yellow");
		obj.add("Black");
		obj.add("Blue");
		
		System.out.println(obj);
		TreeSet<String> obj3=new TreeSet();
		obj3.add("Pink");
		obj3.add("Red");
		obj3.add("Yellow");
		obj3.add("Black");
		obj3.add("Blue");
		System.out.println("obj3");
		
		System.out.println("using Iterator :");
		Iterator obj1=obj.iterator();
		while(obj1.hasNext())
		{
			System.out.println(obj1.next());
		}
		//TreeSet obj2=new TreeSet();
		//obj2.add("White");
		//obj2.add("Purpule");
		
		//obj.addAll(obj2);
		//System.out.println("\naddAll method:"+obj);
		
		 TreeSet<String> reverseobj = (TreeSet<String>) obj.descendingSet();
	     System.out.println("Reverse order TreeSet: " + reverseobj);
	     
	 
	     System.out.println("First Element:"+obj.first());
	     System.out.println("last Element:"+obj.last());
	     System.out.println("Clone method:"+obj.clone());
	     
	     int size=obj.size();
	     System.out.println("Get the number of Elemnet :"+size);
	     
	     System.out.println("First String:"+obj);
	     System.out.println("Second String"+obj3);
		System.out.println("compare Two tree Set:"+obj.equals(obj3));
	}

}
