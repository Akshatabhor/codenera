/*2. Write a Java program to iterate through all elements in a linked list.
*/

package Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Linklist
{
	public static void main(String[] args)
	{
		LinkedList ob = new LinkedList();
		
		ob.add(12);
		ob.add(15);
		ob.add(18);
		ob.add(20);
		ob.add(22);
		ob.add(33);
		
		System.out.println("Linked list : "+ob);
		
		ob.add(55);
		
		
		System.out.println("Linked List using iterator : ");
		Iterator obj = ob.iterator();
		
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
	}

}