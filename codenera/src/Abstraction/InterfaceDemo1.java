package Abstraction;
interface B1
{
	void disp();//it gives default access modifiers in that
	
	default void print()
	{
		System.out.println("defautlt method dispaly");
	}
	static void print1()
	{
		System.out.println("Static method display");
	}
}

public class InterfaceDemo1 implements B1
{
	public void disp()//child class method mandotary to give the public access modifiers
	{
		System.out.println("inteface method display");
	}
	public static void main(String[] args)
	{
		InterfaceDemo1 obj=new InterfaceDemo1();
		obj.disp();
		obj.print();
		B1.print1();
	}

}
