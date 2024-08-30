package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeDemo {
	public static void main(String[] args ) 
	{
		Deque ob=new ArrayDeque();
		ob.add("java");
		ob.add("python");
		ob.add("javaScript");
		ob.add("HTML");
		ob.add("Linux");
		System.out.println(ob);
		
		System.out.println("using iterator:");
		Iterator io=ob.iterator();
		while(io.hasNext())
		{
			System.out.println(io.next());
		}
		
		System.out.println("poll first method:"+ob.pollFirst());
		System.out.println("poll last metod:"+ob.pollLast());
		System.out.println(ob);
		
		System.out.println("offer method first:"+ob.offerFirst("ubuntu"));
		System.out.println("offer method last:"+ob.offerLast("Android"));
		System.out.println(ob);
		
		System.out.println("peek element first:"+ob.peekFirst());
		System.out.println("Peek elemet last:"+ob.peekLast());
		System.out.println(ob);
		
		System.out.println("remove element:"+ob.remove());
		System.out.println(ob);
		
		System.out.println("contains methood:"+ob.contains("HTML"));
		System.out.println("Element method:"+ob.element());
		
		

	}

}
