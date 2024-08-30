/*Q8.Wap enter an array and find the no in array  which is equal to the sum of 1st and last element.
*/

package RevisionPractice;

import java.util.Scanner;

public class SumOf1StANdLastElement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter the element of Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=a[0]+a[a.length-1];
		}
		System.out.println("Sum of first and last element is:"+sum);
		
	}

}
