/*2. Write a program that uses multiple threads to calculate the sum of an array of numbers. 
 * Each thread should sum a portion of the array, and then the main thread should add up the 
 * individual sums to get the total sum.(using synchronization)*/

package Synchronization;
import java.util.Arrays;
class ArraySum
{
	int a[];
	static int sum=0;
	int s,e;
	ArraySum(int a[])
	{
		this.a=a;
	}
	public synchronized void calsum(int s, int e)
	{
		int tsum=0;
		for(int i=s; i<e; i++)
		{
			sum+=a[i];
			tsum=tsum+a[i];
		}
		System.out.println(Thread.currentThread().getName()+" sum: "+tsum);
	}
}
public class SyncEx2SumOffarray extends Thread
{
		static ArraySum obj;
		int s,e;
		public SyncEx2SumOffarray(int s, int e) {
			this.s=s;
			this.e=e;
		}
		public void run()
		{
			obj.calsum(s,e);
		}
	public static void main(String[] args) throws InterruptedException
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		obj = new ArraySum(a);
		SyncEx2SumOffarray t1 = new SyncEx2SumOffarray(0,a.length/2);
		SyncEx2SumOffarray t2 = new SyncEx2SumOffarray(a.length/2,a.length);
		System.out.println("Given Array:"+Arrays.toString(a));
	
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println("Array sum:"+ArraySum.sum);
		
	}

}