/*9. Write a program to calculate the sum of the digits of a given number until the sum becomes a single digit.
Enter a number: 12345
Sum of digits until a single digit: 6
*/

package PracticePrivious;

import java.util.Scanner;

public class Sumofdigitsuntilasingledigit 
{
	public void Sumofdigitsuntilasingledigit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		int sum=0;
		while(no>=9)
		{
			int rem=0;
			sum=0;
			for(int i=no;i!=0;i=i/10)
			{
				rem=i%10;
				sum=sum+rem;
			}
			no=sum;
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Sumofdigitsuntilasingledigit obj=new Sumofdigitsuntilasingledigit();
		obj.Sumofdigitsuntilasingledigit();
	}

}
