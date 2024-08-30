package Polymorphism;

class A
{
	public void disp()
	{
		System.out.println("base class display method");
	}
}
class B extends A 
{
	public void disp()
	{
		System.out.println("derived class display method");

	}
}
public class MethodOverriding 
{
	public static void main(String[] args)
	{
		A obj=new A();//upcasting 
		obj.disp();
		B obj1=new B();
		obj1.disp();
	}

}
//upcasting- A obj=new B
//obj.disp();