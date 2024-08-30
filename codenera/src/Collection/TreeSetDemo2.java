/*9. Write a Java program to find numbers less than 7 in a tree set.
 * 10. Write a Java program to get the element in a tree set which is 
 * greater than or equal to the given element.
11. Write a Java program to get the element in a tree set less than or
 equal to the given element.
 12. Write a Java program to get the element in a tree set strictly greater 
 than or equal to the given element.
13. Write a Java program to get an element in a tree set that has
 a lower value than the given element.
14. Write a Java program to retrieve and remove the first element of a tree set.
15. Write a Java program to retrieve and remove the last element of a tree set.

*/

package Collection;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) 
	{
		TreeSet obj=new TreeSet();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		//obj.add(6);
		obj.add(7);
		obj.add(8);
		obj.add(9);
		obj.add(10);


		System.out.println(obj);
		
		System.out.println("Number less than 7:"+obj.headSet(7));
		
		System.out.println("set is greter or equal to 6:"+obj.ceiling(6));
		System.out.println("All set is greter or equal to 6:"+obj.tailSet(6));
		System.out.println("set is less or Equal to 6:"+obj.floor(6));
		System.out.println("All set is less or Equal to 6:"+obj.headSet(6));
		System.out.println("lower value of 4:"+obj.lower(4));
		System.out.println("First Element of Tree Set:"+obj.pollFirst());
		System.out.println("After The PollFirst Method Apply"+obj);
		System.out.println("Last Element of Tree set:"+obj.pollLast());
		System.out.println("After the PollLast Method Apply"+obj);
		System.out.println("Remove Element:"+obj.remove(8));
		System.out.println("After Removing Element:"+obj);
		System.out.println("Remove All Element:"+obj.removeAll(obj));
		System.out.println(obj);
	}

}
