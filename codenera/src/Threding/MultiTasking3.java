package Threding;
class Multitasking extends Thread
{
	public void run()
	{
		for(int i=2;i<10;i=i+2)
		{
			System.out.println(i);
		}
	}
}
public class MultiTasking3 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		MultiTasking3 t1=new MultiTasking3();
		t1.start();
		Multitasking t2 =new Multitasking();
		t2.start();
	}

}
