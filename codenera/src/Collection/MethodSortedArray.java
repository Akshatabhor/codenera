package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MethodSortedArray 
{

	public static void main(String[] args) 
	{
		System.out.println("color list");
		ArrayList obj=new ArrayList<>();
		obj.add("pink");
		obj.add("yellow");
		obj.add("red");
		obj.add("black");
		obj.add("white");
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		System.out.println("after sorting of array");
		Collections.sort(obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		

	}

}
