package Polymorphism;
class Parent
{
	String Name;
	void print()
	{
		System.out.println("parent method called");
	}
}
class Child extends Parent
{
	int age;
	void print()
	{
		System.out.println("child method called");

	}
}
public class UpCasting {

	public static void main(String[] args) 
	{
		Parent obj=new Child();//upcasting
		obj.Name= "Akshata";
		
		Child obj2 = (Child)obj;//downcasting
		obj2.age=24;
		
		System.out.println(obj2.Name);
		System.out.println(obj2.age);

		obj2.print();
	
	}

}
