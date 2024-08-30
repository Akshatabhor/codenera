
/*class extends and interface impliments*/
package Abstraction;


interface In1
{
	public void d1();
	public void d2();
}
interface In2 extends In1
{
	public void d3();
}
public class InterfaceDemo2 implements In1,In2
{
	public void d1()
	{
		System.out.println("d1 method");	
	}
	public void d2()
	{
		System.out.println("d2 method");	
	}
	public void d3()
	{
		System.out.println("d3 method");	
	}
	public static void main(String[] args)
	{
		InterfaceDemo2 obj1 = new InterfaceDemo2();
		obj1.d1();
		obj1.d2();
		obj1.d3();
	}
	
}
