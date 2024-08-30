/*Q9. WAP to replace all negative value with its immediate left elements square. Means 
     arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
     Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].*/

package RevisionPractice;

import java.util.Scanner;

public class ReplaceNegativeWithLeftElmentSquare {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the Element of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
			}
		}
		System.out.println("square of left element");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
