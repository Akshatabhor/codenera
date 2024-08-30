package Collection;

import java.util.ArrayList;
import java.util.List;

public class ExtractMethod {

	public static void main(String[] args) 
	{
		ArrayList<Integer> obj=new ArrayList<>();
		obj.add(11);
		obj.add(12);
		obj.add(13);
		obj.add(14);
		obj.add(15);
		obj.add(16);
		obj.add(17);
		System.out.println("before extract arraylist:"+obj);
		List<Integer>obj1=obj.subList(0, 4);
		System.out.println("after extract arraylist:"+obj1);
		//System.out.println(obj.subList(0, 4));
	}

}
