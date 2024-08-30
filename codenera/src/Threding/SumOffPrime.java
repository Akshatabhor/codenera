package Threding;
import java.util.Scanner;
class PrimeNum
{
	public void prime(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			int cnt=0;
			for(int j=1;j<end;j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(i);
				SumOffPrime.sum=SumOffPrime.sum+i;
			}
			
		}
		System.out.println("Sum of prime number"+SumOffPrime.sum);
	}
}
public class SumOffPrime extends Thread
{

	int start,end;
	static int sum=0;
	static PrimeNum obj;
	SumOffPrime(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		obj.prime(start, end);
	}
	public static void main(String[] args) throws InterruptedException
	{
		obj=new PrimeNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start number");
		int n1=sc.nextInt();
		System.out.println("Enter End Number");
		int n2=sc.nextInt();
		SumOffPrime t1=new SumOffPrime(0,n2/2);
		SumOffPrime t2=new SumOffPrime(n2/2,n2);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
	}



}
