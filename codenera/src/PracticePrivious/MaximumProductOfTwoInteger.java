/*1.Write a Java program to find maximum product of two integers 
 * in a given array of integers. 
 */

package PracticePrivious;
import java.util.Scanner;
public class MaximumProductOfTwoInteger 
{
	public void MaximumProductOfTwoInteger()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array elemnt:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0;
		int ind1=0;
		int ind2=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>i;j--)
			{
				if(a[j]*a[i]>max)
				{
					max=a[j]*a[i];
					ind1=i;
					ind2=j;
				}
			}
		}
		System.out.println("maximum product:"+max);
		if(ind1!=-1 && ind2!=-1)
		{
			System.out.println("pair of element: (" +a[ind1]+ ", "+a[ind2]+") ");
		}
	}
	public static void main(String[] args) 
	{
		MaximumProductOfTwoInteger obj=new MaximumProductOfTwoInteger();
		obj.MaximumProductOfTwoInteger();
	}

}
