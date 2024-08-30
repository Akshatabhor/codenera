package Synchronization;

import java.util.Scanner;
class pallindrome
{
	public synchronized void pallindrome(int start,int end)
	{
		int c=0;
		for(int i=start;i<=end;i++)
		{
			int rem=0,rev=0;
			int sum=0;
			for(int j=i;j!=0;j=j/10)
			{
				rem=j%10;
				rev=(rev*10)+rem;
				sum=sum+rem;
				c++;
				
			}
			if(i==rev)
			{
				System.out.println(rev);
		
				PalindromeRange.sum=PalindromeRange.sum+rev;
			}
		}
		System.out.println("sum of pallindromes element:"+PalindromeRange.sum);
	
	}
}
public class PalindromeRange extends Thread
{
	int start,end;
	static int sum=0;
	static pallindrome obj;
	PalindromeRange(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		obj.pallindrome(start,end);
	}

	public static void main(String[] args) throws Exception
	{
		obj=new pallindrome();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no");
		int n1=sc.nextInt();
		System.out.println("enter the second no");
		int n2=sc.nextInt();
		PalindromeRange t1=new PalindromeRange(0,n2/2);
		PalindromeRange t2=new PalindromeRange(n2/2,n2);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
		System.out.println("main completed");
	}

}
