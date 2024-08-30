package Threding;
import java.util.Scanner;
public class MultipleThreadSumArray extends Thread
{
	
		static int a[];
		static int sum=0;
		int start, end;
		
		MultipleThreadSumArray(int start, int end)
		{
			this.start=start;
			this.end=end;
		}
		
		
		public void run()
		{
			for (int i = start; i < end; i++) 
			{
				sum=sum+a[i];
			}
			
		}

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		
		a=new int[size];
		System.out.println("Enter elements of array");
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		MultipleThreadSumArray t1= new MultipleThreadSumArray(0,a.length/2);
		MultipleThreadSumArray t2= new MultipleThreadSumArray(a.length/2, a.length);
				
				t1.start();
				t1.join();
				t2.start();
				t2.join();
				
				System.out.println("sum of array: "+ sum);
				System.out.println("Main Completed.. ");
		
	}

}