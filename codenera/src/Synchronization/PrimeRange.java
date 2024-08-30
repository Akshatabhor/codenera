/*Write a program that uses multiple threads to calculate the
 *  prime series. Each thread should calculate the half prime 
 *  series and sum of prime numbers , and then the main thread 
 *  should print the sum of all prime numbers.*/
package Synchronization;
import java.util.Scanner;
class Prime
{
	public synchronized void primer(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			int cnt=0;
			for(int j=1;j<=end;j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(i);
				PrimeRange.sum=PrimeRange.sum+i;
				
			}
		}
		System.out.println("Sum of Prime Elements:"+PrimeRange.sum);

	}
}
public class PrimeRange extends Thread
{
	int start,end;
	static int sum=0;
	static Prime obj;
	PrimeRange(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	
	public void run()
	{
		obj.primer(start, end);
	}
	public static void main(String[] args)throws Exception
	{
		obj=new Prime();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number first");
			int n1=sc.nextInt();
			System.out.println("Enter number second");
			int n2=sc.nextInt();
			
			
			PrimeRange t1=new PrimeRange(0,n2/2);
			PrimeRange t2=new PrimeRange(n2/2,n2);
			
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			
			System.out.println("Main Comapleted...");
	}

}