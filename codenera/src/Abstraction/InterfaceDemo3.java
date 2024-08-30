package Abstraction;
interface c1
{
	void disp1();//it gives default access modifiers in that
}
interface c2
{
	void disp1();
	void print();
}
interface c3
{
	void add();
}

public class InterfaceDemo3 implements c1,c2,c3
{
	public void disp1()//child class method mandotary to give the public access modifiers
	{
		System.out.println("inteface method display");
	}
	public void print()
	{
		System.out.println("interface method print");
	}
	public void add()
	{
		int result =20+30;
		System.out.println("addition:"+result);
	}
	public static void main(String[] args)
	{
		InterfaceDemo3 obj=new InterfaceDemo3();
		obj.disp1();
		obj.print();
		obj.add();
		
	}

}
