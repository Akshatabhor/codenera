package Recursion;

public class PowerOfGivenNumber
{
	public static long power(int x,int y)
	{
		if(y==0)
		{
			return 1;
		}
		return x* power(x,(y-1));  //x^y = x^y-1*x
	}
	public static void main(String[] args) 
	{
		System.out.println(power(5,2));
	}

}
