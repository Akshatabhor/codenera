package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateMethod {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList();
        for (int i = 0; i < 10; i++)
            al.add(i);
        System.out.println(al);

       
        Iterator<Integer> itr = al.iterator();
        System.out.println("even no:");
        while (itr.hasNext()) 
       {
        	int i = itr.next();
        	if (i % 2 != 0)
                itr.remove();
        }
        System.out.println(al);
        
        
	}
}
