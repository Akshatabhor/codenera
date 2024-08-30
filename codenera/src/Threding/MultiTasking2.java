package Threding;

public class MultiTasking2 extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		MultiTasking2 t1=new MultiTasking2();
		t1.start();
		MultiTasking2 t2=new MultiTasking2();
		t2.start();
	}

}
