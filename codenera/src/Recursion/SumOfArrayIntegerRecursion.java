package Recursion;

public class SumOfArrayIntegerRecursion 
{
	public static int sum(int a[],int i)
	{
		if(i==a.length)
		{
			return 0;
		}
		return sum(a,i+1)+a[i];
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		System.out.println(sum(a,0));
	}

}
