package dpack;
import mypack.*;
class C
{
	protected void disp1()
	{
		System.out.println("display 1 method...");
	}
}
public class A extends B {

	public static void main(String[] args)
	{
		C obj=new C();
		obj.disp1();
		A obj1=new A();
		System.out.println(obj1.b);
		obj1.disp();
	}

}
