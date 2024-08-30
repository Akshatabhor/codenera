package RevisionPractice;

import java.util.Scanner;

public class CheckPrimeNo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		int c=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				c++;
			}
		}
		if(c==1)
		{
			System.out.println("Given no is Prime");
		}
		else
		{
			System.out.println("Given no is Not Prime");
		}
	}

}
