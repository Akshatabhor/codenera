package oops;

public class thismethodchaining 
{
	
	thismethodchaining()
	{
		this(11);
		System.out.println("default constructor");
	}
	thismethodchaining(int a)
	{
		this(20.30f);
		System.out.println("one integer argument constructor value:"+a);
	}
	thismethodchaining(float b)
	{
		this(30,20.30f);
		System.out.println("one float argument constructor value:"+b);

	}
	thismethodchaining(int a,float b)
	{
		this(20.30f,30);
		System.out.println("one interge rone float argument constructor value:"+a+"  value of b:"+b);

	}
	thismethodchaining(float a,int b)
	{
		
		System.out.println("one float one integer argument constructor value:"+a+" valueof b:"+b);

	}

	public static void main(String[] args) 
	{
		System.out.println("main method started..........");
		thismethodchaining obj=new thismethodchaining();
		System.out.println("main method completed.........");
	}

}
