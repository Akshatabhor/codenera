package RevisionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class FunctiontoFindMinElementInArrayList {

	public static void main(String[] args)
	{
		ArrayList<Integer> ob=new ArrayList();
		ob.add(30);
		ob.add(55);
		ob.add(10);
		ob.add(80);
		ob.add(40);
		
		int min=Collections.min(ob);
		System.out.println("max element in arraylist is:"+min);
	}
	

}
