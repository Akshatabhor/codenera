package RevisionPractice;

import java.util.Scanner;

/*Q2.Write a Java program to print all the LEADERS in the array.
  Note: An element is leader if it is greater than all the elements to its right side.
input : 
a[] = {16, 17, 4, 3, 5, 2}, 
output :  17 5 2*/
public class LeaderElemnet {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of Array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Leader element");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					c++;
				}
			}
			if(c==0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
