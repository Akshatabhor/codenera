package Abstraction;
abstract class abcAbstract
{
	abstract void print();
	abcAbstract()
	{
		System.out.println("parent constructor");
	}
	public void display()
	{
		System.out.println("concerete method in abstact class");
	}
}
public class Abstractiondemo extends abcAbstract
{
	Abstractiondemo()
	{
		super();
		System.out.println("child class constructor");
	}
	
	void print()
	{
		System.out.println("abstract print method in abstract class");
	}
	public static void main(String[] args) 
	{
		Abstractiondemo obj=new Abstractiondemo();
		obj.display();
		obj.print();

	}

}
