/*2.Write a Java program to shuffle a given array of integers.  
Example:
Input :
nums = { 1, 2, 3, 4, 5, 6 }
Output:
Shuffle Array: [4, 2, 6, 5, 1, 3]
*/

package Practice;

import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Element of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Random obj=new Random();
		for(int i=0;i<a.length;i++)
		{
			int ind=obj.nextInt(a.length);
			int t=a[i];
			a[i]=a[ind];
			a[ind]=t;
		}
		System.out.println("Shuffle Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	
	}

}
