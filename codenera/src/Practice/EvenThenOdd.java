/*Q10.Given an array arr[] of integers, segregate even and odd numbers in the array. Such that all the even numbers should be present first, and then the odd numbers.

Examples:  

Input: arr[] = 1 9 5 3 2 6 7 11
Output: 2 6 5 3 1 9 7 11
*/

package Practice;

import java.util.Scanner;

public class EvenThenOdd {

	public static void main(String[] args)
	{
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size");
				int size=sc.nextInt();
				int a[]=new int[size];
				System.out.println("enter the element of array");
				for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt();
				}
				for(int i=0;i<a.length;i++)
				{
					if(a[i]%2==1)
					{
						for(int j=i+1;j<a.length;j++)
						{
							if(a[j]%2==0)
							{
								int t=a[i];
								a[i]=a[j];
								a[j]=t;
								break;
							}
						}
					}
				}
				System.out.println("segregate even first the odd");
				for(int i=0;i<a.length;i++)
				{
					System.out.println(a[i]+" ");
				}
				
				
	}
				
				
		
		
	}


