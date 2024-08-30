/*Implement the Comparable interface for a Person class that 
 * compares instances based on their age.
*/

package Collection;

import java.util.ArrayList;
import java.util.Collections;

class parent implements Comparable<parent>
{
	private String name;
	private int age;
	
	public parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(parent o) 
	{
		if(age==o.age)
		return 0;
		else if(age<o.age)
			return -1;
		else
			return 1;
	}
	@Override
	public String toString() {
		return "\n [name=" + name + ", age=" + age + "]";
	}
}
public class ComparableInterface1 {
	public static void main(String[] args) 
	{
		parent obj1=new parent("Akshata",24);
		parent obj2=new parent("Trupti",25);
		parent obj3=new parent("Komal",19);
		parent obj4=new parent("Pooja",15);
		parent obj5=new parent("Rucha",28);
		
		ArrayList<parent> obj=new ArrayList();
		obj.add(obj1);
		obj.add(obj2);
		obj.add(obj3);
		obj.add(obj4);
		obj.add(obj5);
		
		System.out.println("\nGiven ArrayList:"+obj);
		
	Collections.sort(obj);
	System.out.println("\nAfter Sorting ArrayList:"+obj);


	}

}

