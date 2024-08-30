package Threding;
import java.util.Scanner;
/*
 * Write a program that uses threads to calculate the sum of the digits of a large number. 
 * Each thread should sum a portion of the digits, and then the main thread should 
 * combine the results.
 * */
public class MultipleThreadDigitSum extends Thread{
	
	static int sum=0;
	static int a[];
	int Start,end;
	MultipleThreadDigitSum(int Start,int end)
	{
		this.Start=Start;
		this.end=end;
	}
	
	public void run()
	{	int tsum=0;
		for(int i=Start; i<end;i++)
		{
			sum+=a[i];
			tsum+=a[i];
		}
		System.out.println(Thread.currentThread().getName()+" : "+tsum);
	}

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter digit to Count Sum of Digits:");
		int n=sc.nextInt();	
		int c=0;
			for(int i=n; i!=0; i=i/10)
			{
				c++;
			}
		System.out.println(c);
		a= new int[c];
		int x=0;
		for(int i=n; i!=0; i=i/10)
		{
			int rem=i%10;
			a[x++]=rem;
		}
		
		MultipleThreadDigitSum t1 = new MultipleThreadDigitSum(0,a.length/2);
		MultipleThreadDigitSum t2 = new MultipleThreadDigitSum(a.length/2,a.length);
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
		System.out.println("Sum of all digits of number: "+sum);
		
		
	}

}
