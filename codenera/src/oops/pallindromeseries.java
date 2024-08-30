package oops;

import java.util.Scanner;

public class pallindromeseries 
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first the no");
		int first=sc.nextInt();
		System.out.println("enter the last no");
		int last=sc.nextInt();
		for(int i=first;i<last;i++)
		{
			int rem=0;int rev=0;int sum=0;
			{
				for(int j=i;j!=0;j=j/10)
				{
					rem=j%10;
					sum=sum+rem;
					rev=(rev*10)+rem;
				}
			}
			sum=0;
			if(i==rev)
			{
				for(int t=i;t!=0;t=t/10)
				{
					rem =t%10;
					sum=sum+rem;
				}
				if(sum>10)
				{
					System.out.println(i);
				}
			
			}
			

		}
		

			
		
	}
	public static void main(String[] args) 
	{
		pallindromeseries obj=new pallindromeseries();
		obj.run();
	}

}
