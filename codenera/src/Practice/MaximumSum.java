/*8. Given an array arr[] of size N, the task is to find the maximum possible sum of i*arr[i] when the array can be rotated any number of times.

  Examples :  

 Input: arr[] = {1, 20, 2, 10}
 Output: 72.We can get 72 by rotating array twice.
 {2, 10, 1, 20}
 20*3 + 1*2 + 10*1 + 2*0 = 72

 Input: arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9}
 Output: 330
 We can get 330 by rotating array 9 times.
 {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
 0*1 + 1*2 + 2*3 … 9*10 = 330*/

package Practice;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum 
{
	public static int maxSum(int a[],int n)
	{
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0;i < n;i++)
		{
			int sum = 0;
			for(int j = 0;j < n;j++)
			{
				int ind = (i+j) % n;
				sum += j*a[ind];
			}
			maxSum = Math.max(maxSum, sum);
		}
		return maxSum;
	}

	public static void main(String[] args)
	{
		int[] a={10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int n = a.length;
		System.out.println(maxSum(a,n));

	}

}