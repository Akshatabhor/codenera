package Threding;
class TrafficSignal2 extends Thread
{
	public void run()
	{
		System.out.println("it's red wait for 30sec");
	}
}
class TrafficSignal1 extends Thread
{
	public void run()
	{
		System.out.println("it's yellow be ready to go");
	}
}
public class Trafficsignal extends Thread
{
	public void run()
	{
		System.out.println("it's green go hurrreyy!!!");
	}
	public static void main(String[] args) 
	{
		System.out.println("main started");
		Trafficsignal t1=new Trafficsignal();
		t1.start();
		TrafficSignal1 t2=new TrafficSignal1();
		t2.start();
		TrafficSignal2 t3=new TrafficSignal2();
		t3.start();
	}

}
