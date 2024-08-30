package Collection;

import java.util.PriorityQueue;

public class priorityQueueDemo {

	public static void main(String[] args) 
	{
		PriorityQueue ob=new PriorityQueue();
		ob.add(12);
		ob.add(50);
		ob.add(24);
		ob.add(1);
		ob.add(30);
		
		System.out.println(ob);
		
		PriorityQueue<String> obj=new PriorityQueue<String>();
		obj.add("Trupti");
		obj.add("Komal");
		obj.add("Akshata");
		obj.add("Ashwini");
		obj.add("Nisha");
		
		System.out.println(obj);
		
		PriorityQueue<String> obk=new PriorityQueue<String>();
		obk.add("java");
		obk.add("simple");
		obk.add("programming");
		obk.add("Application");
		obk.add("language");
		
		System.out.println(obk);
		

	}

}
