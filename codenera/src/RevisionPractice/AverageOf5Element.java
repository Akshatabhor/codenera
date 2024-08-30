/*Q10.Wap to input an array and find its average of first 5 element
*/

package RevisionPractice;

import java.util.Scanner;

public class AverageOf5Element {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		int avg=sum/5;//double avg=sum/5;
		System.out.println("average of first 5 element:"+avg);
	}

}
