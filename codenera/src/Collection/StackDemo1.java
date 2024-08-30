/*1. Write a Java program to implement a stack with push and pop operations. 
 * Find the top element of the stack and check if it is empty or not.
*/

package Collection;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) 
	{
		Stack ob=new Stack();
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		ob.push(5);
		
		System.out.println("Given Stack:"+ob);
		
		System.out.println(ob.pop());
		System.out.println("after pop the element:"+ob);
		System.out.println("after pop check stack is empty or not:"+ob.empty());

	}

}
