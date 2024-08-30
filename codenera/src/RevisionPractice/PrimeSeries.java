package RevisionPractice;

import java.util.Scanner;

public class PrimeSeries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first and last No");
		int first=sc.nextInt();
		int last=sc.nextInt();
		for(int i=first;i<=last;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(i);
			}
		}
	}

}
