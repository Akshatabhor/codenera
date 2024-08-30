package Practice;
class A1
{
	String color="red";
	int a=10;
}
class A2 extends A1
{
	void print()
	{
		System.out.println("parent class:"+super.color);
		System.out.println("parent class:"+a);
	}
}

public class SuperKeyword 
{

	public static void main(String[] args)
	{
		A2 obj=new A2();
		obj.print();
	}

}
