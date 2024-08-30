/*5. Write a recursive Java method to compute the sum of all odd numbers up to a given number N.
*/

package Recursion;

import java.util.Scanner;

public class sumofoddno
{
	public static int disp(int n)
	{
		if(n<=0)
		{
			return 0;
		}
		if (n % 2 == 1) 
		{
            return n + disp(n - 2);
        } 
		else 
		{
            return disp(n - 1);
        }
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		int sum=disp(no);
		System.out.println("sum of odd no:"+sum);
		
		
	}

}
