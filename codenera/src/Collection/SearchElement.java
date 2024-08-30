/*7. Write a Java program to search for an element in an array list.*/

package Collection;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		System.out.println(obj);
		
		if(obj.contains(3))
		{
			System.out.println("containt element are present");
		}
		else
		{
			System.out.println("containt element are not present");
		}

	}

}
