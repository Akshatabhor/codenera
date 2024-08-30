/*1. Write a Java program to append the specified element to the end of a linked list.
*/
package Collection;

import java.util.LinkedList;

public class LinkListAppendMethod 
{

	public static void main(String[] args) 
	{
		LinkedList obj=new LinkedList();
		obj.add(1);
		obj.add(2);
		obj.add(1);
		
		System.out.println(obj);
		
		obj.add(4);
		System.out.println("append the specified element:"+obj);
		
		/*int rem=0;
		int rev=0;
		for(int i=obj;i!=0;i=i/10)
		{
			rem=i%10;
			rev=(rev*10)+rem;
			
		}
		System.out.println(rev);
		if(obj==rev)
		{
			System.out.println("given linklist list is pallindrome");
		}
		else
		{
			System.out.println("given linklist is not pallindrome");
		}*/
	}

}
