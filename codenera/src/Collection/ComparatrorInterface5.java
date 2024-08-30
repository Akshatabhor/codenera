package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person5 {
    private String firstName;
    private String lastName;
    private int age;
    
	public Person5(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "\n[firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
}
class LastNameComparator implements Comparator<Person5> {
    public int compare(Person5 p1, Person5 p2) {
        return p1.getLastName().compareTo(p2.getLastName());
    }

	
}
public class ComparatrorInterface5
{

	public static void main(String[] args) 
	{
		Person5 obj1=new Person5("Akshata","Bhor",24);
		Person5 obj2=new Person5("Komal","Kushekar",25);
		Person5 obj3=new Person5("Trupti","Gholap",23);
		Person5 obj4=new Person5("Nisha","Saswade",28);
		
		ArrayList <Person5> obj=new ArrayList();
		obj.add(obj1);
		obj.add(obj2);
		obj.add(obj3);
		obj.add(obj4);
		System.out.println("\nGiven ArrayList:"+obj);
		
	Collections.sort(obj, new LastNameComparator());
	
	System.out.println("\nAfter Sorting:"+obj);

		
		


	}

}
