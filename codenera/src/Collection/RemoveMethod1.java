/*6. Write a Java program to remove the third element from an array list.*/

package Collection;

import java.util.ArrayList;

public class RemoveMethod1 {

	public static void main(String[] args)
	{
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		System.out.println("given ArrayList:");
		System.out.println(obj);
		System.out.println("remove 3rd element");
		int ind=3;
		obj.remove(ind);
		System.out.println(obj);

	}

}
