package Synchronization;
class Booking2
{
	static int total_Seats = 10;
	
	public static synchronized void seatbook(int seat)
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
class myth1 extends Thread
{
	Booking2 obj1;
	int seat;
	public myth1(Booking2 obj1,int seat)
	{
		this.obj1=obj1;
		this.seat=seat;
	}
	public void run()
	{
		obj1.seatbook(seat);
	}
	
}
class myth2 extends Thread
{
	Booking2 obj2;
	int seat;
	public myth2(Booking2 obj2,int seat)
	{
		this.obj2=obj2;
		this.seat=seat;
	}
	public void run()
	{
		obj2.seatbook(seat);
	}
}
public class StaticSynchronization 
{

	public static void main(String[] args)
	{
		Booking2 obj1=new Booking2();
		myth1 t1=new myth1(obj1,7);
		myth1 t2=new myth1(obj1,5);
		t1.start();
		t2.start();
		Booking2 obj2=new Booking2();
		myth2 t3=new myth2(obj2,8);
		myth2 t4=new myth2(obj2,4);
		t3.start();
		t4.start();
		System.out.println("main completed");
		
		
	}

}
