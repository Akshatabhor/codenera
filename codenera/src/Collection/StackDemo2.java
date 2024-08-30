/*2. Write a Java program to sort the elements of a given stack 
 * in ascending order or decending order.
*/

package Collection;

import java.util.Comparator;
import java.util.Stack;

public class StackDemo2 {

	public static void main(String[] args) 
	{
		Stack ob=new Stack();
		ob.push(9);
		ob.push(2);
		ob.push(5);
		ob.push(4);
		ob.push(3);
		
		System.out.println("Given Stack:"+ob);
		
	ob.sort(null);
	System.out.println("sorting in asending order:"+ob);
		
	ob.sort(Comparator.reverseOrder());
	System.out.println("sorting in decending order:"+ob);
	}

	

}
