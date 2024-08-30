/*3. Write a Java program to iterate through all elements in a linked 
 * list starting at the specified position.
*/

package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class iterateMethodAtSpecifiedPosition {

	public static void main(String[] args) 
	{
		
		LinkedList obj=new LinkedList();
		obj.add(11);
		obj.add(12);
		obj.add(13);
		obj.add(14);
		System.out.println(obj);

	
		ListIterator obj1=obj.listIterator(2);
		System.out.println("the list is as follow");
		while(obj1.hasNext())
		{
			System.out.println(obj1.next());
		}
		
	}

}
