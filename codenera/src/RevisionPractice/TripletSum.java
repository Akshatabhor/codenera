package RevisionPractice;

import java.util.Scanner;

/*Q1.Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. 
If there is such a triplet present in array, then print the triplet and return true. Else return false.

Examples: 
 
Input: array = {12, 3, 4, 1, 6, 9}, sum = 24; 
Output: 12, 3, 9*/
public class TripletSum {

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
		System.out.println("Triplet sum:");
		int sum=sc.nextInt();
		
		for(int i=0;i<a.length-2;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==sum)
					{
						System.out.println("Triple is:"+a[i]+","+a[j]+","+a[k]);
					}
				}
			}
		}
	}

}
