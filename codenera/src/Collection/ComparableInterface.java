package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	private int rollno;
	private String name;
	private int age;
	
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) 
	{
		/*Namewise sorting*/
		
		return o.name.compareTo(o.name);//Assending order
		//return o.name.compareTo(name);//decending order
		/*if(age==o.age)
			return 0;
		else if(age<o.age)
			return -1;
		else
			return 1;*/
	}

	@Override
	public String toString() {
		return "\n[rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	public Object getLastName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class ComparableInterface 
{

	public static void main(String[] args) 
	{
		Student ob1=new Student(1, "akshata" ,40);
		Student ob2=new Student(2, "ashwini" ,35);
		Student ob3=new Student(3, "trupti" ,25);
		Student ob4=new Student(4, "komal" ,48);
		Student ob5=new Student(5, "rucha" ,30);
		
		ArrayList<Student> ob=new ArrayList();
		ob.add(ob1);
		ob.add(ob2);
		ob.add(ob3);
		ob.add(ob4);
		ob.add(ob5);
		
		System.out.println("Given ArrayList String:"+ob);
		
		Collections.sort(ob);
		System.out.println("student class After sorting:\n"+ob);
		
		


	}

}
