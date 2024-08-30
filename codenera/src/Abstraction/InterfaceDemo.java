package Abstraction;
interface A1
{
	void disp();//it gives default access modifiers in that
}

public class InterfaceDemo implements A1
{
	public void disp()//child class method mandotary to give the public access modifiers
	{
		System.out.println("inteface method display");
	}
	public static void main(String[] args)
	{
		InterfaceDemo obj=new InterfaceDemo();
		obj.disp();
	}

}
