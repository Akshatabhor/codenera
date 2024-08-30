/*Write a Java program to create a class called Person with 
private instance variables name, age. and country. 
Provide public getter and setter methods to access and modify these variables.*/

package Encapsulation;
class person
{
	private String name;
	private int age;
	private String country;
	//setter method
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	//getter method
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
}
public class Example1 
{

	public static void main(String[] args) 
	{
		person obj=new person();
		obj.setName("Akshata");
		obj.setAge(24);
		obj.setCountry("India");
		
		System.out.println("name of person:" +obj.getName());
		System.out.println("age of person:" +obj.getAge());
		System.out.println("country of person:" +obj.getCountry());

	}

}
