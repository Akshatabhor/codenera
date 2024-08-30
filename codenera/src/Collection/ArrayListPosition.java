package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPosition
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		ArrayList obj=new ArrayList();
		obj.add("red");
		obj.add("yellow");
		obj.add("green");
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		
		
		int ind=3;
		obj.add(ind, "pink");
		System.out.println("after the insert the index");
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		
		
	}

}
