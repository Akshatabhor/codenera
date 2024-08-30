package RevisionPractice;

import java.util.ArrayList;

public class RemoveArrayListElementAtIndex {

	public static void main(String []args) 
	{
		ArrayList<Integer> ob=new ArrayList();
		ob.add(1);
		ob.add(2);
		ob.add(3);
		ob.add(4);
		ob.add(5);
		
		int removeindex=2;
		
		
		System.out.println("remove element at index 2:"+ob.remove(removeindex));
		
		System.out.println("after removing the index 2 "+ob);

		
	}

}
