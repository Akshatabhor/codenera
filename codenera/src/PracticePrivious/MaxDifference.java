/* Write a Java program to find maximum difference between 
 * two elements in a given array of integers such that 
 * smaller element appears before larger element.
 *///Example:
//Input :
//nums = { 2, 3, 1, 7, 9, 5, 11, 3, 5 }
//Output:
//The maximum difference between two elements of the said array elements
//10 */

package PracticePrivious;
import java.util.Scanner;
public class MaxDifference
{
	public void MaxDifference()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>i;j--)
			{
				if(a[j]-a[i]>max)
				{
					max=a[j]-a[i];
				}
			}
		}
		System.out.println("max difference:"+max);
	}
	
	public static void main(String[] args) 
	{
		MaxDifference obj=new MaxDifference();
		obj.MaxDifference();
	}

}
