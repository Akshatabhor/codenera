package StaticKeyword;
class base
{
	public static void method()
	{
		System.out.println("static method base");
	}
	public void method1()
	{
		System.out.println("non-static method1 base");

	}
}
class derived extends base
{
	public static void method()
	{
		System.out.println("static method derived");

	}
	public void method1()
	{
		System.out.println("non-static method1 derived");

	}
}
public class MethodHiding {

	public static void main(String[] args) 
	{
		base obj=new derived();
		obj.method1();
		obj.method();
		
		base obj1=new base();
		obj1.method1();
		obj1.method();
	}

}
