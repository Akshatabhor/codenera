package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueueMax {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> ps=new PriorityQueue<>();
        ps.offer(12);
        ps.offer(19);
        ps.offer(1);
        ps.offer(93);
        ps.offer(56);
        System.out.println("Priority Queue:");
        System.out.println(ps);
        System.out.println("max Priority Queue:");
       TreeSet<Integer> ts=new TreeSet<>(ps);
        Iterator it=ts.descendingIterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }

	}

}
