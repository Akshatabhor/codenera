package Collection;

import java.util.ArrayList;

public class EnhancedMethod {

	public static void main(String[] args)
	{
		ArrayList<Integer> obj=new ArrayList();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		System.out.println("Enhanced Method");
		for(Integer i:obj)//enhanced method, this is another way to print the element
		{
			System.out.println(i);
		}

	}

}
