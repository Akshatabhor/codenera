/*1.Write a Java program to find maximum product of two integers in a given array 
 * of integers. 
*/
package Practice;

public class MaximumProduct
{

	public static void main(String[] args)
	{
		int a[]= {2,3,5,7,-7,5,8};
		int max=0;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=a.length-1;j>i;j--)
		{
			if(a[j]*a[i]>max)
			{
				max=a[j]*a[i];
			}
		}
	}
	System.out.println("max product:"+max);

	}

}
