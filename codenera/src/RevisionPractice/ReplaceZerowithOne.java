/*Q3. WAP to replace all the 0’s with 1’s in your array. Your array is 
 * [26, 0, 67, 45, 0, 78, 
    54, 34, 10, 0, 34] */

package RevisionPractice;

import java.util.Scanner;

public class ReplaceZerowithOne {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("replace 0 with 1");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
