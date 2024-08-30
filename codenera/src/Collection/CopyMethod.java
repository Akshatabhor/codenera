/*9. Write a Java program to copy one array list into another.
*/
package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CopyMethod {

	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		System.out.println("1st ArrayList:"+obj);
		ArrayList obj2=new ArrayList();
		obj2.add(6);
		obj2.add(7);
		obj2.add(8);
		obj2.add(9);
		obj2.add(10);
		System.out.println("2nd ArrayList:"+obj2);
		
		Collections.copy(obj,obj2);
		System.out.println("1st ArrayList :"+obj);
		System.out.println("2nd ArrayList"+obj2);
		


	}

}
