/*2. Calculate the sum of elements in an integer array using recursion.*/

package Recursion;

public class Q2 
{
	public static int disp(int arr[],int n)
	{
		if(n<=0)
		{
			return 0;
		}
		else
		{
            return arr[n - 1] + disp(arr, n - 1);

		}
	}

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int sum=disp(a,a.length);
		System.out.println("sum of element:"+sum);
	}

}
