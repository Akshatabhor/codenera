/*Q6. WAP input 10 elements and multiply 5th elements by 25.
*/

package RevisionPractice;

import java.util.Scanner;

public class Element5thMultiplyBy25 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		 int mul = a[4]*25;
		 System.out.println("5th elemnet multiply by 25:"+mul);
	}

}
