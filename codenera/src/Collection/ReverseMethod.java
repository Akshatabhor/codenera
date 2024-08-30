package Collection;

import java.util.ArrayList;
import java.util.Comparator;

public class ReverseMethod {

	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		System.out.println("before reverse ArrayList:"+obj);
		obj.sort(Comparator.reverseOrder());
		System.out.println("after reverse ArrayList:"+obj);
		
	}

}
