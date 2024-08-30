package Synchronization;
class Booking1
{
	int total_Seats = 10;
	
	public  void seatbook(int seat)
	{
		synchronized (this)
		{
			System.out.println("current thread booking name :"+Thread.currentThread().getName());
		
		if(total_Seats < seat)
		{
			System.out.println("Seats are not available....");
			System.out.println("There are only : "+total_Seats);
		}
		else
		{
			System.out.println(seat + " seats Booking confirmed....");
			total_Seats = total_Seats-seat;
			
			System.out.println("Total seat : "+total_Seats);
		}
		}
	}
}
public class SyncExBlock extends Thread
{
	static Booking bobj;
	int no;
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		bobj.seatbook(no);
	}
	public static void main(String[] args) 
	{
		bobj = new Booking();
		SyncExBlock t1=new SyncExBlock();
		SyncExBlock t2=new SyncExBlock();
		SyncExBlock t3=new SyncExBlock();
		t1.no=5;
		t2.no=3;
		t3.no=2;
		t1.start();
		t2.start();
		t3.start();
		
	}

}
