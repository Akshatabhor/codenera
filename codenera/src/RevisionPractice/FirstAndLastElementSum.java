/*Q11.Wap enter an array and find the sum of 1st and last element in the given array.
*/
package RevisionPractice;

import java.util.Scanner;

public class FirstAndLastElementSum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array");
		int size =sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter the element of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=a[0]+a[size-1];
		}
		System.out.println("sum of first and last number:"+sum);
		
	}

}
