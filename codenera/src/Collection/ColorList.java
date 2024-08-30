package Collection;

import java.util.ArrayList;

public class ColorList 
{

	public static void main(String[] args)
	{
		ArrayList obj=new ArrayList();
		obj.add("red");
		obj.add("yellow");
		obj.add("pink");
		obj.add("blue");
		System.out.println("color list");
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}

}
