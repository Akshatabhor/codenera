package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveMethod 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of color");
		int size=sc.nextInt();
		
		ArrayList obj=new ArrayList();
		System.out.println("enter the color ");
		for(int i=0;i<size;i++)
		{
			String color=sc.next();
			obj.add(color);
		}
		System.out.println("given Arraylist :"+obj);
		System.out.println("enter index to remove in given arraylist");
		int ind=sc.nextInt();
		String color1=sc.nextLine();
		obj.remove(ind);
		System.out.println("given ArrayList after remove:"+obj);
		obj.removeAll(obj);
		System.out.println("given Arraylist remove all element:"+obj);
	}

}
