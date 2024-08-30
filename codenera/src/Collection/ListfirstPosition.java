package Collection;

import java.util.ArrayList;

public class ListfirstPosition 
{

	public static void main(String[] args)
	{
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		int ind=4;
		obj.add(ind, 11);
		System.out.println("Arraylist After insert element");
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}

}
