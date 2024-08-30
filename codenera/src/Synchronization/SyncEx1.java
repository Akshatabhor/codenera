package Synchronization;
class Booking
{
	int total_Seats = 10;
	
	public synchronized void seatbook(int seat)
	{
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
public class SyncEx1 extends Thread
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
		
		SyncEx1 t1 = new SyncEx1();
		SyncEx1 t2 = new SyncEx1();
		SyncEx1 t3 = new SyncEx1();
		
		t1.no=4;
		t2.no=3;
		t3.no=1;
		
		t1.start();
		t2.start();
		t3.start();

	}

}
