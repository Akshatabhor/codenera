package Collection;

import java.util.ArrayList;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add("Akshata");
		obj.add("java language");
		obj.add(true);
		obj.add(13.400);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		
		
	}

}
