package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
    private String name;
    private double height;
    
    public Person(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}
    
    @Override
    public int compareTo(Person o) {
    	return Double.compare(this.height, o.height);
    }

	@Override
	public String toString() {
		return "\n[name=" + name + ", height=" + height + "]";
	}

	

}
public class ComparableInterface6 
{

	public static void main(String[] args) 
	{
		Person obj1=new Person("Akshata",5.5);
		Person obj2=new Person("Nisha",5);
		Person obj3=new Person("Ashwini",4.5);
		Person obj4=new Person("Trupti",5.8);
		
		ArrayList <Person>obj=new ArrayList();
		obj.add(obj1);
		obj.add(obj2);
		obj.add(obj3);
		obj.add(obj4);
		
		System.out.println("\nGiven ArrayList:"+obj);
		Collections.sort(obj);
		System.out.println("\nAfter sorting:"+obj);

	}

}
