package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {

	public static void main(String[] args) 
	{
		PriorityQueue<String> obj=new PriorityQueue();
		obj.add("trupti");
		obj.add("Om");
		obj.add("Aditya");
		obj.add("Gaurav");
		obj.add("Komal");
		obj.offer("ishu");
		
		System.out.println(obj);
		System.out.println("using iterator");
		Iterator io=obj.iterator();
		while(io.hasNext())
		{
			System.out.println(io.next());
		}
		System.out.println();
		System.out.println("peek the element:"+obj.peek());
		System.out.println(obj);
		System.out.println("element method:"+obj.element());
		System.out.println(obj);
		System.out.println("poll method:"+obj.poll());
		System.out.println(obj);
		System.out.println("remove method:"+obj.remove());
		System.out.println(obj);
	

	}

}
