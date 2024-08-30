package RevisionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListInAsendingOrder {

	public static void main(String[] args) 
	{
		ArrayList<String> ob=new ArrayList();
		ob.add("hello");
		ob.add("Akshata");
		ob.add("programming");
		ob.add("language");
		ob.add("Gaurav");
		
		Collections.sort(ob);
		System.out.print("ArrayList sort in asending order:"+ob);
	}

}
