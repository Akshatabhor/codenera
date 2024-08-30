package Collection;

import java.util.ArrayList;
import java.util.Scanner;
public class RetriveMethod 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		System.out.println("enter index to retrive the element");
		int ind=sc.nextInt();
		
		System.out.println("element at "+ind+": "+obj.get(ind));
	}

}
