/*Q7.Wap enter an array and print the square of the element which is on odd position.
 * even position
*/

package RevisionPractice;

import java.util.Scanner;

public class SquareOfOddPositionElement {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter the element of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)//odd position and even position condition is if(a[i]%2==0)
			{
				a[i]=a[i]*a[i];
			}
		}
		System.out.println("square of odd position element");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
