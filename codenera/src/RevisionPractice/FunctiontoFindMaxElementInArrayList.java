package RevisionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class FunctiontoFindMaxElementInArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> ob=new ArrayList();
		ob.add(30);
		ob.add(55);
		ob.add(10);
		ob.add(80);
		ob.add(40);
		
		int max=Collections.max(ob);
		System.out.println("max element in arraylist is:"+max);
	}

}
