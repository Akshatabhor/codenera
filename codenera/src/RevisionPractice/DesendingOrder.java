/*Q10. Wap enter an array and sort that in decending order
*/

package RevisionPractice;

import java.util.Scanner;

public class DesendingOrder {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size =sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Descending order:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
