package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterotor {

	public static void main(String[] args) 
	{
		ArrayList ob=new ArrayList();
		ob.add(11);
		ob.add(12);
		ob.add(13);
		ob.add(14);
		ob.add(15);
		
		ListIterator io=ob.listIterator();
		//io.next();
		System.out.println("next cursor:"+io.next());
		System.out.println("previous cursor:"+io.previous());
		

		while(io.hasNext())
		{
			System.out.println(io.next());
		}
		System.out.println("reverse Arraylist:");
		while(io.hasPrevious())
		{
			System.out.println(io.previous());
		}
		



	}

}
