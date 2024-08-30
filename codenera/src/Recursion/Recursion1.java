package Recursion;

public class Recursion1 
{
	
	static int c=0;
	public static void disp()
	{
		c++;
		if(c<=10)
		{
			System.out.println("Hello java");
			disp();
		}
		
	}
	public static void main(String[] args)
	{
		Recursion1 ob=new Recursion1();
		ob.disp();
		
	}

}
