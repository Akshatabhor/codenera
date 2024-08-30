/*Q11.Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n. Find the smallest number that is missing from the array. 

Examples:

Input: {0, 1, 2, 6, 9}, n = 5, m = 10 
Output: 3
*/

package Practice;

import java.util.Scanner;

public class SmallestNoMissingFromArray {

	public static void main(String[] args) 
	{
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter size of array:");
				int size = sc.nextInt();
				int m=0;
			
				System.out.println("Enter a Range from "+m+" :");
				int range =sc.nextInt();
				
				if(range > size)
				{
				int a[]= new int[size];
				System.out.println("Enter Elements in Array:");
				
				for(int i=0; i<a.length; i++)
				{
					a[i]=sc.nextInt();
				}
				System.out.println("Smallest Missing Number: ");
				for(int i=0; i<=range; i++)
				{
					if(i==a[i])
						continue;
					else
						System.out.println(i);
						break;
				}
				}

	}
}
