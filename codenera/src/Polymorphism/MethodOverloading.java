package Polymorphism;

public class MethodOverloading 
{
	public void add()
	{
		System.out.println("no argument");
	}
	public void add(int a)
	{
		System.out.println("one integer argument");
		
	}
	public void add(float b)
	{
		System.out.println("one float argument");
	
	}
	public void add(int a, float b)
	{
		System.out.println("one interger & one float argument ");
		
	}
	public void add(float a,int b )
	{
		System.out.println("one float & one integer");
	}
	
	public static void main(String[] args)
	{
		MethodOverloading obj=new MethodOverloading();
		obj.add();
		obj.add(15);
		obj.add(12.3f);
		obj.add(15, 12.3f);
		obj.add(12.3f, 15);
		
		
	}

}
