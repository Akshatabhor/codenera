/*1. Write a Java program to create a priority queue, add some colors 
 * (strings) and print out the elements of the priority queue.
 * 2. Write a Java program to iterate through all elements in the priority queue.
3. Write a Java program to add all the elements of a priority queue to another priority queue.
4. Write a Java program to insert a given element into a priority queue.
5. Write a Java program to remove all elements from a priority queue.

*/

package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) 
	{
		PriorityQueue<String> obj=new PriorityQueue();
		obj.add("Yellow");
		obj.add("Red");
		obj.add("White");
		obj.add("Pink");
		obj.add("Black");
		
		System.out.println(obj);
		
		System.out.println("using Iterator:");
		Iterator io=obj.iterator();
		while(io.hasNext())
		{
			System.out.println(io.next());
		}
		PriorityQueue<String> obj1=new PriorityQueue();
		obj1.add("Purple");
		obj1.add("Orange");
		obj.addAll(obj1);
		System.out.println("addAll method:"+obj);
		
		System.out.println("Insert the element:"+obj.add("Blue"));
		System.out.println(obj);
		
		System.out.println("remove all the element:"+obj.removeAll(obj));
		System.out.println(obj);
		

	}

}
