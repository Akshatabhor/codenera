/*Q7.Wap enter an array and print it in reverse order.
*/

package RevisionPractice;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		
		System.out.println("Enter the Element of Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int ind=0;
		System.out.println("Reverse Order:");
		for(int i=a.length-1;i>=0;i--)
		{
			b[ind]=a[i];
			ind++;
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
	}

}
