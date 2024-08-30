/*6. Write a Java program to count the number of elements in a priority queue.
 7. Write a Java program to compare two priority queues.
8. Write a Java program to retrieve the first element of the priority queue.
9. Write a Java program to retrieve and remove the first element.
10. Write a Java program to convert a priority queue to an array containing all its elements.
11. Write a Java program to convert a Priority Queue element to string representations.
12. Write a Java program to change priorityQueue to maximum priority queue.
*/

package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo3 {

	public static void main(String[] args) 
	{
		PriorityQueue<String> obj=new PriorityQueue();
		obj.add("Yellow");
		obj.add("Red");
		obj.add("White");
		obj.add("Pink");
		obj.add("Black");
		
		System.out.println(obj);
		
		System.out.println("Count the element:"+obj.size());
		PriorityQueue<String> obj1=new PriorityQueue();
		obj1.add("Yellow");
		obj1.add("Red");
		obj1.add("White");
		obj1.add("Pink");
		obj1.add("Black");
		System.out.println(obj1);
		
	System.out.println("First String:"+obj);
	System.out.println(("Second String:"+obj1));
	System.out.println("compre two prioritys:"+obj.containsAll(obj1));
	System.out.println("retrive First Element:"+obj.peek());
	System.out.println("retrive and remove:"+obj.poll());
	System.out.println(obj);
	String[]str=new String[obj.size()];
    Iterator it=obj.iterator();
    int count=0;
    while (it.hasNext())
    {
        str[count++]=(String)it.next();
    }
    System.out.println("Queue into array :"+ Arrays.toString(str));
    System.out.println("String representation:"+obj.toString());
	
		
	}

}
