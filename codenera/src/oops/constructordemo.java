package oops;

public class constructordemo 
{
	public constructordemo()
	{
		System.out.println("default constructor");
	}
	public constructordemo(int a)
	{
		System.out.println("one integer argument constructor value:"+a);
	}
	public constructordemo(float b)
	{
		System.out.println("one float argument constructor value:"+b);

	}
	public constructordemo(int a,float b)
	{
		System.out.println("one interge rone float argument constructor value:"+a+"  value of b:"+b);

	}
	public constructordemo(float a,int b)
	{
		System.out.println("one float one integer argument constructor value:"+a+" valueof b:"+b);

	}
	public static void main(String[] args) 
	{
		System.out.println("main method started....");
		constructordemo obj=new constructordemo();
		constructordemo obj1=new constructordemo(10);
		constructordemo obj2=new constructordemo(10.20f);
		constructordemo obj3=new constructordemo(10,20.10f);
		constructordemo obj4=new constructordemo(20.10f,10);
	
	}
	}
