package Threding;
class Addingdigit
{
	public static synchronized void addD(int start, int end)
	{
		int sum=0;
		for(int i=start;i<end;i++)
		{
			sum += Character.getNumericValue(ThreadingDigitSum.no.charAt(i));
		}
		System.out.println("half portion sum:"+sum);
		ThreadingDigitSum.sum += sum;
		//System.out.println(Thread.currentThread().getName()+" "+ThreadingDigitSum.sum);
	}
}
public class ThreadingDigitSum extends Thread
{
	static String no="12345678";
	static int sum=0;
	int start,end;
	ThreadingDigitSum(int start, int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		Addingdigit.addD(start, end);
	}
	public static void main(String[] args) throws InterruptedException
	{
		ThreadingDigitSum t1=new ThreadingDigitSum(0,no.length()/2);
		ThreadingDigitSum t2=new ThreadingDigitSum(no.length()/2, no.length());
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println("Total sum:"+ThreadingDigitSum.sum);
		System.out.println("main completed");
	}

}
