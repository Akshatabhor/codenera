package Recursion;

public class ReverseNumber 
{
	public static void rev(int no)
	{
		if(no<10)
		{
			System.out.println(no);
			return;
		}
		else
		{
			System.out.println(no%10);
			rev(no/10);
		}
	}
	public static void main(String[] args) 
	{
		rev(12345);
	}

}
