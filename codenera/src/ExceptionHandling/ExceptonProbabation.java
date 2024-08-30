package ExceptionHandling;

public class ExceptonProbabation 
{
	public void method1()
	{
		System.out.println("entery method 1 block");
		try {
		int ans=12/0;
		System.out.println(ans);
		}
		catch(Exception e)
		{
			System.out.println("exception occur"+e);
		}
		System.out.println("method 1 block");
	}
	public void method2()
	{
		System.out.println("entry method 2 block");
		method1();
		System.out.println("method 2 block");
	}
	public void method3()
	{
		System.out.println("entry method 3 block");
		method2();
		System.out.println("method 3 block");
	}

	public static void main(String[] args) 
	{
		ExceptonProbabation obj=new ExceptonProbabation();
		System.out.println("main entry block");
		try
		{
			obj.method3();
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception occure"+e);
		}
		System.out.println("main entry completed");
	}

}
