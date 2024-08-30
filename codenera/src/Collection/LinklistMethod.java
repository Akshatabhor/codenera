package Collection;

import java.util.LinkedList;

public class LinklistMethod {

	public static void main(String[] args) 
	{
		LinkedList obj=new LinkedList();
		obj.add(11);
		obj.add(12);
		obj.add(11);
		obj.add(13);
		obj.add(11);
		obj.add(14);
		
		LinkedList obj1=new LinkedList();
		obj1.add(15);
		obj1.add(16);
		obj1.add(17);
		obj1.add(18);
		System.out.println("List 1:"+obj);
		System.out.println("List 2:"+obj1);
		
		obj.add(20);
		System.out.println("add element in first list:"+obj);
		obj1.add(2,21);
		System.out.println("add element in second index in 2nd list:"+obj1);
		
		obj.addAll(obj1);
		System.out.println("first list adding second list:"+obj);
		
		obj.addFirst(100);
		obj.addLast(200);
		System.out.println("in list 1 add first and last element:"+obj);
		
		
		LinkedList clone1 = (LinkedList) obj.clone();
		System.out.println("After clone:"+clone1);
		
		if(obj.contains(110))
		{
			System.out.println("110 is present in list");
		}
		else
		{
			System.out.println("110 is not present in list");
		}
		
		obj.remove();
		System.out.println(obj);
		obj.removeFirst();
		System.out.println(obj);
		
		obj.removeLast();
		System.out.println(obj);
		
		System.out.println("lastindexof()method:"+obj.lastIndexOf(11));
	
		System.out.println(obj1.isEmpty());
		
		
		
		
	}

}
